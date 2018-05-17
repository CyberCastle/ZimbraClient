package cl.cc;

import cl.cc.reporting.MailReport;
import com.sun.xml.ws.developer.WSBindingProvider;
import cl.cc.zcsclient.service.ZcsPortType;
import cl.cc.zcsclient.service.ZcsService;
import java.util.List;
import cl.cc.zcsclient.AccountBy;
import cl.cc.zcsclient.AccountSelector;
import cl.cc.zcsclient.account.AuthRequest;
import cl.cc.zcsclient.account.AuthResponse;
import cl.cc.zcsclient.mail.SearchRequest;
import cl.cc.zcsclient.mail.SearchResponse;
import cl.cc.zcsclient.util.ZimbraSoapHeaderContextUtil;
import java.io.FileOutputStream;

/**
 *
 * @author CyberCastle
 */
public class Run {

    public static void main(String... arg) throws Exception {

        ZcsService service = new ZcsService();
        ZcsPortType port = service.getZcsServicePort();

        AccountSelector accountSelector = new AccountSelector();
        accountSelector.setBy(AccountBy.NAME);
        accountSelector.setValue("mail_adress");

        AuthRequest authRequest = new AuthRequest();
        authRequest.setAccount(accountSelector);
        authRequest.setPersistAuthTokenCookie(true);
        authRequest.setPassword("password");

        AuthResponse authResponse = port.authRequest(authRequest);
        String authToken = authResponse.getAuthToken();
        //System.out.println(authToken);

        // Se añade el token.
        ZimbraSoapHeaderContextUtil.addSoapAuthHeader((WSBindingProvider) port, authToken);

        SearchRequest request = new SearchRequest();
        request.setTypes("message");
        request.setFetch("all");
        request.setNeuter(false);

        // Cantidad de Mensages.
        request.setLimit(5);

        // Consulta para la búsqueda
        request.setQuery("antivirus");

        SearchResponse resp = port.searchRequest(request);
        List<Object> hits = resp.getHitOrCOrM();
        System.out.println(hits.size());

        MailReport report = new MailReport();
        report.loadTemplate(Run.class.getClassLoader().getResource("reports/EMailReportTemplate.xlsx").openStream());

        report.fillSheet(hits);
        report.save(new FileOutputStream("/Users/CyberCastle/Downloads/EMailReport.xlsx"));

    }

}
