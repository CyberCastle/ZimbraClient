package cl.cc.zcsclient.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import cl.cc.zcsclient.account.AuthRequest;
import cl.cc.zcsclient.account.AuthResponse;
import cl.cc.zcsclient.account.AutoCompleteGalRequest;
import cl.cc.zcsclient.account.AutoCompleteGalResponse;
import cl.cc.zcsclient.account.ChangePasswordRequest;
import cl.cc.zcsclient.account.ChangePasswordResponse;
import cl.cc.zcsclient.account.CheckLicenseRequest;
import cl.cc.zcsclient.account.CheckLicenseResponse;
import cl.cc.zcsclient.account.CheckRightsRequest;
import cl.cc.zcsclient.account.CheckRightsResponse;
import cl.cc.zcsclient.account.CreateDistributionListRequest;
import cl.cc.zcsclient.account.CreateDistributionListResponse;
import cl.cc.zcsclient.account.CreateIdentityRequest;
import cl.cc.zcsclient.account.CreateIdentityResponse;
import cl.cc.zcsclient.account.CreateSignatureRequest;
import cl.cc.zcsclient.account.CreateSignatureResponse;
import cl.cc.zcsclient.account.DeleteIdentityRequest;
import cl.cc.zcsclient.account.DeleteIdentityResponse;
import cl.cc.zcsclient.account.DeleteSignatureRequest;
import cl.cc.zcsclient.account.DeleteSignatureResponse;
import cl.cc.zcsclient.account.DiscoverRightsRequest;
import cl.cc.zcsclient.account.DiscoverRightsResponse;
import cl.cc.zcsclient.account.DistributionListActionRequest;
import cl.cc.zcsclient.account.DistributionListActionResponse;
import cl.cc.zcsclient.account.EndSessionRequest;
import cl.cc.zcsclient.account.EndSessionResponse;
import cl.cc.zcsclient.account.GetAccountDistributionListsRequest;
import cl.cc.zcsclient.account.GetAccountDistributionListsResponse;
import cl.cc.zcsclient.account.GetAccountInfoRequest;
import cl.cc.zcsclient.account.GetAccountInfoResponse;
import cl.cc.zcsclient.account.GetAllLocalesRequest;
import cl.cc.zcsclient.account.GetAllLocalesResponse;
import cl.cc.zcsclient.account.GetAvailableCsvFormatsRequest;
import cl.cc.zcsclient.account.GetAvailableCsvFormatsResponse;
import cl.cc.zcsclient.account.GetAvailableLocalesRequest;
import cl.cc.zcsclient.account.GetAvailableLocalesResponse;
import cl.cc.zcsclient.account.GetAvailableSkinsRequest;
import cl.cc.zcsclient.account.GetAvailableSkinsResponse;
import cl.cc.zcsclient.account.GetDistributionListMembersRequest;
import cl.cc.zcsclient.account.GetDistributionListMembersResponse;
import cl.cc.zcsclient.account.GetDistributionListRequest;
import cl.cc.zcsclient.account.GetDistributionListResponse;
import cl.cc.zcsclient.account.GetIdentitiesRequest;
import cl.cc.zcsclient.account.GetIdentitiesResponse;
import cl.cc.zcsclient.account.GetInfoRequest;
import cl.cc.zcsclient.account.GetInfoResponse;
import cl.cc.zcsclient.account.GetPrefsRequest;
import cl.cc.zcsclient.account.GetPrefsResponse;
import cl.cc.zcsclient.account.GetRightsRequest;
import cl.cc.zcsclient.account.GetRightsResponse;
import cl.cc.zcsclient.account.GetSMIMEPublicCertsRequest;
import cl.cc.zcsclient.account.GetSMIMEPublicCertsResponse;
import cl.cc.zcsclient.account.GetShareInfoRequest;
import cl.cc.zcsclient.account.GetShareInfoResponse;
import cl.cc.zcsclient.account.GetSignaturesRequest;
import cl.cc.zcsclient.account.GetSignaturesResponse;
import cl.cc.zcsclient.account.GetVersionInfoRequest;
import cl.cc.zcsclient.account.GetVersionInfoResponse;
import cl.cc.zcsclient.account.GetWhiteBlackListRequest;
import cl.cc.zcsclient.account.GetWhiteBlackListResponse;
import cl.cc.zcsclient.account.GrantRightsRequest;
import cl.cc.zcsclient.account.GrantRightsResponse;
import cl.cc.zcsclient.account.ModifyIdentityRequest;
import cl.cc.zcsclient.account.ModifyIdentityResponse;
import cl.cc.zcsclient.account.ModifyPrefsRequest;
import cl.cc.zcsclient.account.ModifyPrefsResponse;
import cl.cc.zcsclient.account.ModifyPropertiesRequest;
import cl.cc.zcsclient.account.ModifyPropertiesResponse;
import cl.cc.zcsclient.account.ModifySignatureRequest;
import cl.cc.zcsclient.account.ModifySignatureResponse;
import cl.cc.zcsclient.account.ModifyWhiteBlackListRequest;
import cl.cc.zcsclient.account.ModifyWhiteBlackListResponse;
import cl.cc.zcsclient.account.ModifyZimletPrefsRequest;
import cl.cc.zcsclient.account.ModifyZimletPrefsResponse;
import cl.cc.zcsclient.account.RevokeRightsRequest;
import cl.cc.zcsclient.account.RevokeRightsResponse;
import cl.cc.zcsclient.account.SearchCalendarResourcesRequest;
import cl.cc.zcsclient.account.SearchCalendarResourcesResponse;
import cl.cc.zcsclient.account.SearchGalRequest;
import cl.cc.zcsclient.account.SearchGalResponse;
import cl.cc.zcsclient.account.SubscribeDistributionListRequest;
import cl.cc.zcsclient.account.SubscribeDistributionListResponse;
import cl.cc.zcsclient.account.SyncGalRequest;
import cl.cc.zcsclient.account.SyncGalResponse;
import cl.cc.zcsclient.mail.AddAppointmentInviteRequest;
import cl.cc.zcsclient.mail.AddAppointmentInviteResponse;
import cl.cc.zcsclient.mail.AddCommentRequest;
import cl.cc.zcsclient.mail.AddCommentResponse;
import cl.cc.zcsclient.mail.AddMsgRequest;
import cl.cc.zcsclient.mail.AddMsgResponse;
import cl.cc.zcsclient.mail.AddTaskInviteRequest;
import cl.cc.zcsclient.mail.AddTaskInviteResponse;
import cl.cc.zcsclient.mail.AnnounceOrganizerChangeRequest;
import cl.cc.zcsclient.mail.AnnounceOrganizerChangeResponse;
import cl.cc.zcsclient.mail.ApplyFilterRulesRequest;
import cl.cc.zcsclient.mail.ApplyFilterRulesResponse;
import cl.cc.zcsclient.mail.ApplyOutgoingFilterRulesRequest;
import cl.cc.zcsclient.mail.ApplyOutgoingFilterRulesResponse;
import cl.cc.zcsclient.mail.AutoCompleteRequest;
import cl.cc.zcsclient.mail.AutoCompleteResponse;
import cl.cc.zcsclient.mail.BounceMsgRequest;
import cl.cc.zcsclient.mail.BounceMsgResponse;
import cl.cc.zcsclient.mail.BrowseRequest;
import cl.cc.zcsclient.mail.BrowseResponse;
import cl.cc.zcsclient.mail.CancelAppointmentRequest;
import cl.cc.zcsclient.mail.CancelAppointmentResponse;
import cl.cc.zcsclient.mail.CancelTaskRequest;
import cl.cc.zcsclient.mail.CancelTaskResponse;
import cl.cc.zcsclient.mail.CheckDeviceStatusRequest;
import cl.cc.zcsclient.mail.CheckDeviceStatusResponse;
import cl.cc.zcsclient.mail.CheckPermissionRequest;
import cl.cc.zcsclient.mail.CheckPermissionResponse;
import cl.cc.zcsclient.mail.CheckRecurConflictsRequest;
import cl.cc.zcsclient.mail.CheckRecurConflictsResponse;
import cl.cc.zcsclient.mail.CheckSpellingRequest;
import cl.cc.zcsclient.mail.CheckSpellingResponse;
import cl.cc.zcsclient.mail.CompleteTaskInstanceRequest;
import cl.cc.zcsclient.mail.CompleteTaskInstanceResponse;
import cl.cc.zcsclient.mail.ContactActionRequest;
import cl.cc.zcsclient.mail.ContactActionResponse;
import cl.cc.zcsclient.mail.ConvActionRequest;
import cl.cc.zcsclient.mail.ConvActionResponse;
import cl.cc.zcsclient.mail.CounterAppointmentRequest;
import cl.cc.zcsclient.mail.CounterAppointmentResponse;
import cl.cc.zcsclient.mail.CreateAppointmentExceptionRequest;
import cl.cc.zcsclient.mail.CreateAppointmentExceptionResponse;
import cl.cc.zcsclient.mail.CreateAppointmentRequest;
import cl.cc.zcsclient.mail.CreateAppointmentResponse;
import cl.cc.zcsclient.mail.CreateContactRequest;
import cl.cc.zcsclient.mail.CreateContactResponse;
import cl.cc.zcsclient.mail.CreateDataSourceRequest;
import cl.cc.zcsclient.mail.CreateDataSourceResponse;
import cl.cc.zcsclient.mail.CreateFolderRequest;
import cl.cc.zcsclient.mail.CreateFolderResponse;
import cl.cc.zcsclient.mail.CreateMountpointRequest;
import cl.cc.zcsclient.mail.CreateMountpointResponse;
import cl.cc.zcsclient.mail.CreateNoteRequest;
import cl.cc.zcsclient.mail.CreateNoteResponse;
import cl.cc.zcsclient.mail.CreateSearchFolderRequest;
import cl.cc.zcsclient.mail.CreateSearchFolderResponse;
import cl.cc.zcsclient.mail.CreateTagRequest;
import cl.cc.zcsclient.mail.CreateTagResponse;
import cl.cc.zcsclient.mail.CreateTaskExceptionRequest;
import cl.cc.zcsclient.mail.CreateTaskExceptionResponse;
import cl.cc.zcsclient.mail.CreateTaskRequest;
import cl.cc.zcsclient.mail.CreateTaskResponse;
import cl.cc.zcsclient.mail.CreateWaitSetRequest;
import cl.cc.zcsclient.mail.CreateWaitSetResponse;
import cl.cc.zcsclient.mail.DeclineCounterAppointmentRequest;
import cl.cc.zcsclient.mail.DeclineCounterAppointmentResponse;
import cl.cc.zcsclient.mail.DeleteDataSourceRequest;
import cl.cc.zcsclient.mail.DeleteDataSourceResponse;
import cl.cc.zcsclient.mail.DeleteDeviceRequest;
import cl.cc.zcsclient.mail.DeleteDeviceResponse;
import cl.cc.zcsclient.mail.DestroyWaitSetRequest;
import cl.cc.zcsclient.mail.DestroyWaitSetResponse;
import cl.cc.zcsclient.mail.DiffDocumentRequest;
import cl.cc.zcsclient.mail.DiffDocumentResponse;
import cl.cc.zcsclient.mail.DismissCalendarItemAlarmRequest;
import cl.cc.zcsclient.mail.DismissCalendarItemAlarmResponse;
import cl.cc.zcsclient.mail.DocumentActionRequest;
import cl.cc.zcsclient.mail.DocumentActionResponse;
import cl.cc.zcsclient.mail.EmptyDumpsterRequest;
import cl.cc.zcsclient.mail.EmptyDumpsterResponse;
import cl.cc.zcsclient.mail.EnableSharedReminderRequest;
import cl.cc.zcsclient.mail.EnableSharedReminderResponse;
import cl.cc.zcsclient.mail.ExpandRecurRequest;
import cl.cc.zcsclient.mail.ExpandRecurResponse;
import cl.cc.zcsclient.mail.ExportContactsRequest;
import cl.cc.zcsclient.mail.ExportContactsResponse;
import cl.cc.zcsclient.mail.FolderActionRequest;
import cl.cc.zcsclient.mail.FolderActionResponse;
import cl.cc.zcsclient.mail.ForwardAppointmentInviteRequest;
import cl.cc.zcsclient.mail.ForwardAppointmentInviteResponse;
import cl.cc.zcsclient.mail.ForwardAppointmentRequest;
import cl.cc.zcsclient.mail.ForwardAppointmentResponse;
import cl.cc.zcsclient.mail.GenerateUUIDRequest;
import cl.cc.zcsclient.mail.GetActivityStreamRequest;
import cl.cc.zcsclient.mail.GetActivityStreamResponse;
import cl.cc.zcsclient.mail.GetAllDevicesRequest;
import cl.cc.zcsclient.mail.GetAllDevicesResponse;
import cl.cc.zcsclient.mail.GetAppointmentRequest;
import cl.cc.zcsclient.mail.GetAppointmentResponse;
import cl.cc.zcsclient.mail.GetApptSummariesRequest;
import cl.cc.zcsclient.mail.GetApptSummariesResponse;
import cl.cc.zcsclient.mail.GetCalendarItemSummariesRequest;
import cl.cc.zcsclient.mail.GetCalendarItemSummariesResponse;
import cl.cc.zcsclient.mail.GetCommentsRequest;
import cl.cc.zcsclient.mail.GetCommentsResponse;
import cl.cc.zcsclient.mail.GetContactsRequest;
import cl.cc.zcsclient.mail.GetContactsResponse;
import cl.cc.zcsclient.mail.GetConvRequest;
import cl.cc.zcsclient.mail.GetConvResponse;
import cl.cc.zcsclient.mail.GetCustomMetadataRequest;
import cl.cc.zcsclient.mail.GetCustomMetadataResponse;
import cl.cc.zcsclient.mail.GetDataSourcesRequest;
import cl.cc.zcsclient.mail.GetDataSourcesResponse;
import cl.cc.zcsclient.mail.GetDocumentShareURLRequest;
import cl.cc.zcsclient.mail.GetEffectiveFolderPermsRequest;
import cl.cc.zcsclient.mail.GetEffectiveFolderPermsResponse;
import cl.cc.zcsclient.mail.GetFilterRulesRequest;
import cl.cc.zcsclient.mail.GetFilterRulesResponse;
import cl.cc.zcsclient.mail.GetFolderRequest;
import cl.cc.zcsclient.mail.GetFolderResponse;
import cl.cc.zcsclient.mail.GetFreeBusyRequest;
import cl.cc.zcsclient.mail.GetFreeBusyResponse;
import cl.cc.zcsclient.mail.GetICalRequest;
import cl.cc.zcsclient.mail.GetICalResponse;
import cl.cc.zcsclient.mail.GetImportStatusRequest;
import cl.cc.zcsclient.mail.GetImportStatusResponse;
import cl.cc.zcsclient.mail.GetItemRequest;
import cl.cc.zcsclient.mail.GetItemResponse;
import cl.cc.zcsclient.mail.GetMailboxMetadataRequest;
import cl.cc.zcsclient.mail.GetMailboxMetadataResponse;
import cl.cc.zcsclient.mail.GetMiniCalRequest;
import cl.cc.zcsclient.mail.GetMiniCalResponse;
import cl.cc.zcsclient.mail.GetMsgMetadataRequest;
import cl.cc.zcsclient.mail.GetMsgMetadataResponse;
import cl.cc.zcsclient.mail.GetMsgRequest;
import cl.cc.zcsclient.mail.GetMsgResponse;
import cl.cc.zcsclient.mail.GetNoteRequest;
import cl.cc.zcsclient.mail.GetNoteResponse;
import cl.cc.zcsclient.mail.GetNotificationsRequest;
import cl.cc.zcsclient.mail.GetNotificationsResponse;
import cl.cc.zcsclient.mail.GetOutgoingFilterRulesRequest;
import cl.cc.zcsclient.mail.GetOutgoingFilterRulesResponse;
import cl.cc.zcsclient.mail.GetPermissionRequest;
import cl.cc.zcsclient.mail.GetPermissionResponse;
import cl.cc.zcsclient.mail.GetRecurRequest;
import cl.cc.zcsclient.mail.GetRecurResponse;
import cl.cc.zcsclient.mail.GetSearchFolderRequest;
import cl.cc.zcsclient.mail.GetSearchFolderResponse;
import cl.cc.zcsclient.mail.GetShareDetailsRequest;
import cl.cc.zcsclient.mail.GetShareDetailsResponse;
import cl.cc.zcsclient.mail.GetShareNotificationsRequest;
import cl.cc.zcsclient.mail.GetShareNotificationsResponse;
import cl.cc.zcsclient.mail.GetSpellDictionariesRequest;
import cl.cc.zcsclient.mail.GetSpellDictionariesResponse;
import cl.cc.zcsclient.mail.GetSystemRetentionPolicyRequest;
import cl.cc.zcsclient.mail.GetSystemRetentionPolicyResponse;
import cl.cc.zcsclient.mail.GetTagRequest;
import cl.cc.zcsclient.mail.GetTagResponse;
import cl.cc.zcsclient.mail.GetTaskRequest;
import cl.cc.zcsclient.mail.GetTaskResponse;
import cl.cc.zcsclient.mail.GetTaskSummariesRequest;
import cl.cc.zcsclient.mail.GetTaskSummariesResponse;
import cl.cc.zcsclient.mail.GetWatchersRequest;
import cl.cc.zcsclient.mail.GetWatchersResponse;
import cl.cc.zcsclient.mail.GetWatchingItemsRequest;
import cl.cc.zcsclient.mail.GetWatchingItemsResponse;
import cl.cc.zcsclient.mail.GetWorkingHoursRequest;
import cl.cc.zcsclient.mail.GetWorkingHoursResponse;
import cl.cc.zcsclient.mail.GetYahooAuthTokenRequest;
import cl.cc.zcsclient.mail.GetYahooAuthTokenResponse;
import cl.cc.zcsclient.mail.GetYahooCookieRequest;
import cl.cc.zcsclient.mail.GetYahooCookieResponse;
import cl.cc.zcsclient.mail.GrantPermissionRequest;
import cl.cc.zcsclient.mail.GrantPermissionResponse;
import cl.cc.zcsclient.mail.ICalReplyRequest;
import cl.cc.zcsclient.mail.ICalReplyResponse;
import cl.cc.zcsclient.mail.ImportAppointmentsRequest;
import cl.cc.zcsclient.mail.ImportAppointmentsResponse;
import cl.cc.zcsclient.mail.ImportContactsRequest;
import cl.cc.zcsclient.mail.ImportContactsResponse;
import cl.cc.zcsclient.mail.ImportDataRequest;
import cl.cc.zcsclient.mail.ImportDataResponse;
import cl.cc.zcsclient.mail.InvalidateReminderDeviceRequest;
import cl.cc.zcsclient.mail.InvalidateReminderDeviceResponse;
import cl.cc.zcsclient.mail.ItemActionRequest;
import cl.cc.zcsclient.mail.ItemActionResponse;
import cl.cc.zcsclient.mail.ListDocumentRevisionsRequest;
import cl.cc.zcsclient.mail.ListDocumentRevisionsResponse;
import cl.cc.zcsclient.mail.ModifyAppointmentRequest;
import cl.cc.zcsclient.mail.ModifyAppointmentResponse;
import cl.cc.zcsclient.mail.ModifyContactRequest;
import cl.cc.zcsclient.mail.ModifyContactResponse;
import cl.cc.zcsclient.mail.ModifyDataSourceRequest;
import cl.cc.zcsclient.mail.ModifyDataSourceResponse;
import cl.cc.zcsclient.mail.ModifyFilterRulesRequest;
import cl.cc.zcsclient.mail.ModifyFilterRulesResponse;
import cl.cc.zcsclient.mail.ModifyMailboxMetadataRequest;
import cl.cc.zcsclient.mail.ModifyMailboxMetadataResponse;
import cl.cc.zcsclient.mail.ModifyOutgoingFilterRulesRequest;
import cl.cc.zcsclient.mail.ModifyOutgoingFilterRulesResponse;
import cl.cc.zcsclient.mail.ModifySearchFolderRequest;
import cl.cc.zcsclient.mail.ModifySearchFolderResponse;
import cl.cc.zcsclient.mail.ModifyTaskRequest;
import cl.cc.zcsclient.mail.ModifyTaskResponse;
import cl.cc.zcsclient.mail.MsgActionRequest;
import cl.cc.zcsclient.mail.MsgActionResponse;
import cl.cc.zcsclient.mail.NoOpRequest;
import cl.cc.zcsclient.mail.NoOpResponse;
import cl.cc.zcsclient.mail.NoteActionRequest;
import cl.cc.zcsclient.mail.NoteActionResponse;
import cl.cc.zcsclient.mail.PurgeRevisionRequest;
import cl.cc.zcsclient.mail.PurgeRevisionResponse;
import cl.cc.zcsclient.mail.RankingActionRequest;
import cl.cc.zcsclient.mail.RankingActionResponse;
import cl.cc.zcsclient.mail.RegisterDeviceRequest;
import cl.cc.zcsclient.mail.RegisterDeviceResponse;
import cl.cc.zcsclient.mail.RemoveAttachmentsRequest;
import cl.cc.zcsclient.mail.RemoveAttachmentsResponse;
import cl.cc.zcsclient.mail.RevokePermissionRequest;
import cl.cc.zcsclient.mail.RevokePermissionResponse;
import cl.cc.zcsclient.mail.SaveDocumentRequest;
import cl.cc.zcsclient.mail.SaveDocumentResponse;
import cl.cc.zcsclient.mail.SaveDraftRequest;
import cl.cc.zcsclient.mail.SaveDraftResponse;
import cl.cc.zcsclient.mail.SearchConvRequest;
import cl.cc.zcsclient.mail.SearchConvResponse;
import cl.cc.zcsclient.mail.SearchRequest;
import cl.cc.zcsclient.mail.SearchResponse;
import cl.cc.zcsclient.mail.SendDeliveryReportRequest;
import cl.cc.zcsclient.mail.SendDeliveryReportResponse;
import cl.cc.zcsclient.mail.SendInviteReplyRequest;
import cl.cc.zcsclient.mail.SendInviteReplyResponse;
import cl.cc.zcsclient.mail.SendMsgRequest;
import cl.cc.zcsclient.mail.SendMsgResponse;
import cl.cc.zcsclient.mail.SendShareNotificationRequest;
import cl.cc.zcsclient.mail.SendShareNotificationResponse;
import cl.cc.zcsclient.mail.SendVerificationCodeRequest;
import cl.cc.zcsclient.mail.SendVerificationCodeResponse;
import cl.cc.zcsclient.mail.SetAppointmentRequest;
import cl.cc.zcsclient.mail.SetAppointmentResponse;
import cl.cc.zcsclient.mail.SetCustomMetadataRequest;
import cl.cc.zcsclient.mail.SetCustomMetadataResponse;
import cl.cc.zcsclient.mail.SetMailboxMetadataRequest;
import cl.cc.zcsclient.mail.SetMailboxMetadataResponse;
import cl.cc.zcsclient.mail.SetTaskRequest;
import cl.cc.zcsclient.mail.SetTaskResponse;
import cl.cc.zcsclient.mail.SnoozeCalendarItemAlarmRequest;
import cl.cc.zcsclient.mail.SnoozeCalendarItemAlarmResponse;
import cl.cc.zcsclient.mail.SyncRequest;
import cl.cc.zcsclient.mail.SyncResponse;
import cl.cc.zcsclient.mail.TagActionRequest;
import cl.cc.zcsclient.mail.TagActionResponse;
import cl.cc.zcsclient.mail.TestDataSourceRequest;
import cl.cc.zcsclient.mail.TestDataSourceResponse;
import cl.cc.zcsclient.mail.UpdateDeviceStatusRequest;
import cl.cc.zcsclient.mail.UpdateDeviceStatusResponse;
import cl.cc.zcsclient.mail.VerifyCodeRequest;
import cl.cc.zcsclient.mail.VerifyCodeResponse;
import cl.cc.zcsclient.mail.WaitSetRequest;
import cl.cc.zcsclient.mail.WaitSetResponse;
import cl.cc.zcsclient.repl.BecomeMasterRequest;
import cl.cc.zcsclient.repl.BecomeMasterResponse;
import cl.cc.zcsclient.repl.BringDownServiceIPRequest;
import cl.cc.zcsclient.repl.BringDownServiceIPResponse;
import cl.cc.zcsclient.repl.BringUpServiceIPRequest;
import cl.cc.zcsclient.repl.BringUpServiceIPResponse;
import cl.cc.zcsclient.repl.ReplicationStatusRequest;
import cl.cc.zcsclient.repl.ReplicationStatusResponse;
import cl.cc.zcsclient.repl.StartCatchupRequest;
import cl.cc.zcsclient.repl.StartCatchupResponse;
import cl.cc.zcsclient.repl.StartFailoverClientRequest;
import cl.cc.zcsclient.repl.StartFailoverClientResponse;
import cl.cc.zcsclient.repl.StartFailoverDaemonRequest;
import cl.cc.zcsclient.repl.StartFailoverDaemonResponse;
import cl.cc.zcsclient.repl.StopFailoverClientRequest;
import cl.cc.zcsclient.repl.StopFailoverClientResponse;
import cl.cc.zcsclient.repl.StopFailoverDaemonRequest;
import cl.cc.zcsclient.repl.StopFailoverDaemonResponse;
import cl.cc.zcsclient.sync.CancelPendingRemoteWipeRequest;
import cl.cc.zcsclient.sync.CancelPendingRemoteWipeResponse;
import cl.cc.zcsclient.sync.GetDeviceStatusRequest;
import cl.cc.zcsclient.sync.GetDeviceStatusResponse;
import cl.cc.zcsclient.sync.RemoteWipeRequest;
import cl.cc.zcsclient.sync.RemoteWipeResponse;
import cl.cc.zcsclient.sync.RemoveDeviceRequest;
import cl.cc.zcsclient.sync.RemoveDeviceResponse;
import cl.cc.zcsclient.sync.ResumeDeviceRequest;
import cl.cc.zcsclient.sync.ResumeDeviceResponse;
import cl.cc.zcsclient.sync.SuspendDeviceRequest;
import cl.cc.zcsclient.sync.SuspendDeviceResponse;
import cl.cc.zcsclient.voice.ChangeUCPasswordRequest;
import cl.cc.zcsclient.voice.ChangeUCPasswordResponse;
import cl.cc.zcsclient.voice.GetUCInfoRequest;
import cl.cc.zcsclient.voice.GetUCInfoResponse;
import cl.cc.zcsclient.voice.GetVoiceFeaturesRequest;
import cl.cc.zcsclient.voice.GetVoiceFeaturesResponse;
import cl.cc.zcsclient.voice.GetVoiceFolderRequest;
import cl.cc.zcsclient.voice.GetVoiceFolderResponse;
import cl.cc.zcsclient.voice.GetVoiceInfoRequest;
import cl.cc.zcsclient.voice.GetVoiceInfoResponse;
import cl.cc.zcsclient.voice.GetVoiceMailPrefsRequest;
import cl.cc.zcsclient.voice.GetVoiceMailPrefsResponse;
import cl.cc.zcsclient.voice.ModifyFromNumRequest;
import cl.cc.zcsclient.voice.ModifyFromNumResponse;
import cl.cc.zcsclient.voice.ModifyVoiceFeaturesRequest;
import cl.cc.zcsclient.voice.ModifyVoiceFeaturesResponse;
import cl.cc.zcsclient.voice.ModifyVoiceMailPinRequest;
import cl.cc.zcsclient.voice.ModifyVoiceMailPinResponse;
import cl.cc.zcsclient.voice.ModifyVoiceMailPrefsRequest;
import cl.cc.zcsclient.voice.ModifyVoiceMailPrefsResponse;
import cl.cc.zcsclient.voice.ResetVoiceFeaturesRequest;
import cl.cc.zcsclient.voice.ResetVoiceFeaturesResponse;
import cl.cc.zcsclient.voice.SearchVoiceRequest;
import cl.cc.zcsclient.voice.SearchVoiceResponse;
import cl.cc.zcsclient.voice.UploadVoiceMailRequest;
import cl.cc.zcsclient.voice.UploadVoiceMailResponse;
import cl.cc.zcsclient.voice.VoiceMsgActionRequest;
import cl.cc.zcsclient.voice.VoiceMsgActionResponse;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.8 Generated source
 * version: 2.2
 *
 */
@WebService(name = "zcsPortType", targetNamespace = "http://www.zimbra.com/wsdl/ZimbraService.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    cl.cc.zcsclient.voice.ObjectFactory.class,
    cl.cc.zcsclient.mail.ObjectFactory.class,
    cl.cc.zcsclient.account.ObjectFactory.class,
    cl.cc.zcsclient.ObjectFactory.class,
    cl.cc.zcsclient.repl.ObjectFactory.class,
    cl.cc.zcsclient.sync.ObjectFactory.class
})
public interface ZcsPortType {

    /**
     *
     * @param params
     * @return returns zimbraaccount.AuthResponse
     */
    @WebMethod(action = "urn:zimbraAccount/Auth")
    @WebResult(name = "AuthResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public AuthResponse authRequest(
            @WebParam(name = "AuthRequest", targetNamespace = "urn:zimbraAccount", partName = "params") AuthRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.AutoCompleteGalResponse
     */
    @WebMethod(action = "urn:zimbraAccount/AutoCompleteGal")
    @WebResult(name = "AutoCompleteGalResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public AutoCompleteGalResponse autoCompleteGalRequest(
            @WebParam(name = "AutoCompleteGalRequest", targetNamespace = "urn:zimbraAccount", partName = "params") AutoCompleteGalRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ChangePasswordResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ChangePassword")
    @WebResult(name = "ChangePasswordResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ChangePasswordResponse changePasswordRequest(
            @WebParam(name = "ChangePasswordRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ChangePasswordRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.CheckLicenseResponse
     */
    @WebMethod(action = "urn:zimbraAccount/CheckLicense")
    @WebResult(name = "CheckLicenseResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public CheckLicenseResponse checkLicenseRequest(
            @WebParam(name = "CheckLicenseRequest", targetNamespace = "urn:zimbraAccount", partName = "params") CheckLicenseRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.CheckRightsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/CheckRights")
    @WebResult(name = "CheckRightsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public CheckRightsResponse checkRightsRequest(
            @WebParam(name = "CheckRightsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") CheckRightsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.CreateDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAccount/CreateDistributionList")
    @WebResult(name = "CreateDistributionListResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public CreateDistributionListResponse createDistributionListRequest(
            @WebParam(name = "CreateDistributionListRequest", targetNamespace = "urn:zimbraAccount", partName = "params") CreateDistributionListRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.CreateIdentityResponse
     */
    @WebMethod(action = "urn:zimbraAccount/CreateIdentity")
    @WebResult(name = "CreateIdentityResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public CreateIdentityResponse createIdentityRequest(
            @WebParam(name = "CreateIdentityRequest", targetNamespace = "urn:zimbraAccount", partName = "params") CreateIdentityRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.CreateSignatureResponse
     */
    @WebMethod(action = "urn:zimbraAccount/CreateSignature")
    @WebResult(name = "CreateSignatureResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public CreateSignatureResponse createSignatureRequest(
            @WebParam(name = "CreateSignatureRequest", targetNamespace = "urn:zimbraAccount", partName = "params") CreateSignatureRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.DeleteIdentityResponse
     */
    @WebMethod(action = "urn:zimbraAccount/DeleteIdentity")
    @WebResult(name = "DeleteIdentityResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public DeleteIdentityResponse deleteIdentityRequest(
            @WebParam(name = "DeleteIdentityRequest", targetNamespace = "urn:zimbraAccount", partName = "params") DeleteIdentityRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.DeleteSignatureResponse
     */
    @WebMethod(action = "urn:zimbraAccount/DeleteSignature")
    @WebResult(name = "DeleteSignatureResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public DeleteSignatureResponse deleteSignatureRequest(
            @WebParam(name = "DeleteSignatureRequest", targetNamespace = "urn:zimbraAccount", partName = "params") DeleteSignatureRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.DiscoverRightsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/DiscoverRights")
    @WebResult(name = "DiscoverRightsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public DiscoverRightsResponse discoverRightsRequest(
            @WebParam(name = "DiscoverRightsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") DiscoverRightsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.DistributionListActionResponse
     */
    @WebMethod(action = "urn:zimbraAccount/DistributionListAction")
    @WebResult(name = "DistributionListActionResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public DistributionListActionResponse distributionListActionRequest(
            @WebParam(name = "DistributionListActionRequest", targetNamespace = "urn:zimbraAccount", partName = "params") DistributionListActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.EndSessionResponse
     */
    @WebMethod(action = "urn:zimbraAccount/EndSession")
    @WebResult(name = "EndSessionResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public EndSessionResponse endSessionRequest(
            @WebParam(name = "EndSessionRequest", targetNamespace = "urn:zimbraAccount", partName = "params") EndSessionRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetAccountDistributionListsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetAccountDistributionLists")
    @WebResult(name = "GetAccountDistributionListsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetAccountDistributionListsResponse getAccountDistributionListsRequest(
            @WebParam(name = "GetAccountDistributionListsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetAccountDistributionListsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetAccountInfoResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetAccountInfo")
    @WebResult(name = "GetAccountInfoResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetAccountInfoResponse getAccountInfoRequest(
            @WebParam(name = "GetAccountInfoRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetAccountInfoRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetAllLocalesResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetAllLocales")
    @WebResult(name = "GetAllLocalesResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetAllLocalesResponse getAllLocalesRequest(
            @WebParam(name = "GetAllLocalesRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetAllLocalesRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetAvailableCsvFormatsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetAvailableCsvFormats")
    @WebResult(name = "GetAvailableCsvFormatsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetAvailableCsvFormatsResponse getAvailableCsvFormatsRequest(
            @WebParam(name = "GetAvailableCsvFormatsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetAvailableCsvFormatsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetAvailableLocalesResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetAvailableLocales")
    @WebResult(name = "GetAvailableLocalesResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetAvailableLocalesResponse getAvailableLocalesRequest(
            @WebParam(name = "GetAvailableLocalesRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetAvailableLocalesRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetAvailableSkinsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetAvailableSkins")
    @WebResult(name = "GetAvailableSkinsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetAvailableSkinsResponse getAvailableSkinsRequest(
            @WebParam(name = "GetAvailableSkinsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetAvailableSkinsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetDistributionListMembersResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetDistributionListMembers")
    @WebResult(name = "GetDistributionListMembersResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetDistributionListMembersResponse getDistributionListMembersRequest(
            @WebParam(name = "GetDistributionListMembersRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetDistributionListMembersRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetDistributionList")
    @WebResult(name = "GetDistributionListResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetDistributionListResponse getDistributionListRequest(
            @WebParam(name = "GetDistributionListRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetDistributionListRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetIdentitiesResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetIdentities")
    @WebResult(name = "GetIdentitiesResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetIdentitiesResponse getIdentitiesRequest(
            @WebParam(name = "GetIdentitiesRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetIdentitiesRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetInfoResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetInfo")
    @WebResult(name = "GetInfoResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetInfoResponse getInfoRequest(
            @WebParam(name = "GetInfoRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetInfoRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetPrefsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetPrefs")
    @WebResult(name = "GetPrefsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetPrefsResponse getPrefsRequest(
            @WebParam(name = "GetPrefsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetPrefsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetRightsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetRights")
    @WebResult(name = "GetRightsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetRightsResponse getRightsRequest(
            @WebParam(name = "GetRightsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetRightsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetSMIMEPublicCertsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetSMIMEPublicCerts")
    @WebResult(name = "GetSMIMEPublicCertsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetSMIMEPublicCertsResponse getSMIMEPublicCertsRequest(
            @WebParam(name = "GetSMIMEPublicCertsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetSMIMEPublicCertsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetShareInfoResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetShareInfo")
    @WebResult(name = "GetShareInfoResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetShareInfoResponse getShareInfoRequest(
            @WebParam(name = "GetShareInfoRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetShareInfoRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetSignaturesResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetSignatures")
    @WebResult(name = "GetSignaturesResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetSignaturesResponse getSignaturesRequest(
            @WebParam(name = "GetSignaturesRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetSignaturesRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetVersionInfoResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetVersionInfo")
    @WebResult(name = "GetVersionInfoResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetVersionInfoResponse getVersionInfoRequest(
            @WebParam(name = "GetVersionInfoRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetVersionInfoRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GetWhiteBlackListResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GetWhiteBlackList")
    @WebResult(name = "GetWhiteBlackListResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GetWhiteBlackListResponse getWhiteBlackListRequest(
            @WebParam(name = "GetWhiteBlackListRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GetWhiteBlackListRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.GrantRightsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/GrantRights")
    @WebResult(name = "GrantRightsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public GrantRightsResponse grantRightsRequest(
            @WebParam(name = "GrantRightsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") GrantRightsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ModifyIdentityResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ModifyIdentity")
    @WebResult(name = "ModifyIdentityResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ModifyIdentityResponse modifyIdentityRequest(
            @WebParam(name = "ModifyIdentityRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ModifyIdentityRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ModifyPrefsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ModifyPrefs")
    @WebResult(name = "ModifyPrefsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ModifyPrefsResponse modifyPrefsRequest(
            @WebParam(name = "ModifyPrefsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ModifyPrefsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ModifyPropertiesResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ModifyProperties")
    @WebResult(name = "ModifyPropertiesResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ModifyPropertiesResponse modifyPropertiesRequest(
            @WebParam(name = "ModifyPropertiesRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ModifyPropertiesRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ModifySignatureResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ModifySignature")
    @WebResult(name = "ModifySignatureResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ModifySignatureResponse modifySignatureRequest(
            @WebParam(name = "ModifySignatureRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ModifySignatureRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ModifyWhiteBlackListResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ModifyWhiteBlackList")
    @WebResult(name = "ModifyWhiteBlackListResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ModifyWhiteBlackListResponse modifyWhiteBlackListRequest(
            @WebParam(name = "ModifyWhiteBlackListRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ModifyWhiteBlackListRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.ModifyZimletPrefsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/ModifyZimletPrefs")
    @WebResult(name = "ModifyZimletPrefsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public ModifyZimletPrefsResponse modifyZimletPrefsRequest(
            @WebParam(name = "ModifyZimletPrefsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") ModifyZimletPrefsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.RevokeRightsResponse
     */
    @WebMethod(action = "urn:zimbraAccount/RevokeRights")
    @WebResult(name = "RevokeRightsResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public RevokeRightsResponse revokeRightsRequest(
            @WebParam(name = "RevokeRightsRequest", targetNamespace = "urn:zimbraAccount", partName = "params") RevokeRightsRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.SearchCalendarResourcesResponse
     */
    @WebMethod(action = "urn:zimbraAccount/SearchCalendarResources")
    @WebResult(name = "SearchCalendarResourcesResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public SearchCalendarResourcesResponse searchCalendarResourcesRequest(
            @WebParam(name = "SearchCalendarResourcesRequest", targetNamespace = "urn:zimbraAccount", partName = "params") SearchCalendarResourcesRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.SearchGalResponse
     */
    @WebMethod(action = "urn:zimbraAccount/SearchGal")
    @WebResult(name = "SearchGalResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public SearchGalResponse searchGalRequest(
            @WebParam(name = "SearchGalRequest", targetNamespace = "urn:zimbraAccount", partName = "params") SearchGalRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.SubscribeDistributionListResponse
     */
    @WebMethod(action = "urn:zimbraAccount/SubscribeDistributionList")
    @WebResult(name = "SubscribeDistributionListResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public SubscribeDistributionListResponse subscribeDistributionListRequest(
            @WebParam(name = "SubscribeDistributionListRequest", targetNamespace = "urn:zimbraAccount", partName = "params") SubscribeDistributionListRequest params);

    /**
     *
     * @param params
     * @return returns zimbraaccount.SyncGalResponse
     */
    @WebMethod(action = "urn:zimbraAccount/SyncGal")
    @WebResult(name = "SyncGalResponse", targetNamespace = "urn:zimbraAccount", partName = "params")
    public SyncGalResponse syncGalRequest(
            @WebParam(name = "SyncGalRequest", targetNamespace = "urn:zimbraAccount", partName = "params") SyncGalRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.AddAppointmentInviteResponse
     */
    @WebMethod(action = "urn:zimbraMail/AddAppointmentInvite")
    @WebResult(name = "AddAppointmentInviteResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public AddAppointmentInviteResponse addAppointmentInviteRequest(
            @WebParam(name = "AddAppointmentInviteRequest", targetNamespace = "urn:zimbraMail", partName = "params") AddAppointmentInviteRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.AddCommentResponse
     */
    @WebMethod(action = "urn:zimbraMail/AddComment")
    @WebResult(name = "AddCommentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public AddCommentResponse addCommentRequest(
            @WebParam(name = "AddCommentRequest", targetNamespace = "urn:zimbraMail", partName = "params") AddCommentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.AddMsgResponse
     */
    @WebMethod(action = "urn:zimbraMail/AddMsg")
    @WebResult(name = "AddMsgResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public AddMsgResponse addMsgRequest(
            @WebParam(name = "AddMsgRequest", targetNamespace = "urn:zimbraMail", partName = "params") AddMsgRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.AddTaskInviteResponse
     */
    @WebMethod(action = "urn:zimbraMail/AddTaskInvite")
    @WebResult(name = "AddTaskInviteResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public AddTaskInviteResponse addTaskInviteRequest(
            @WebParam(name = "AddTaskInviteRequest", targetNamespace = "urn:zimbraMail", partName = "params") AddTaskInviteRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.AnnounceOrganizerChangeResponse
     */
    @WebMethod(action = "urn:zimbraMail/AnnounceOrganizerChange")
    @WebResult(name = "AnnounceOrganizerChangeResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public AnnounceOrganizerChangeResponse announceOrganizerChangeRequest(
            @WebParam(name = "AnnounceOrganizerChangeRequest", targetNamespace = "urn:zimbraMail", partName = "params") AnnounceOrganizerChangeRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ApplyFilterRulesResponse
     */
    @WebMethod(action = "urn:zimbraMail/ApplyFilterRules")
    @WebResult(name = "ApplyFilterRulesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ApplyFilterRulesResponse applyFilterRulesRequest(
            @WebParam(name = "ApplyFilterRulesRequest", targetNamespace = "urn:zimbraMail", partName = "params") ApplyFilterRulesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ApplyOutgoingFilterRulesResponse
     */
    @WebMethod(action = "urn:zimbraMail/ApplyOutgoingFilterRules")
    @WebResult(name = "ApplyOutgoingFilterRulesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ApplyOutgoingFilterRulesResponse applyOutgoingFilterRulesRequest(
            @WebParam(name = "ApplyOutgoingFilterRulesRequest", targetNamespace = "urn:zimbraMail", partName = "params") ApplyOutgoingFilterRulesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.AutoCompleteResponse
     */
    @WebMethod(action = "urn:zimbraMail/AutoComplete")
    @WebResult(name = "AutoCompleteResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public AutoCompleteResponse autoCompleteRequest(
            @WebParam(name = "AutoCompleteRequest", targetNamespace = "urn:zimbraMail", partName = "params") AutoCompleteRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.BounceMsgResponse
     */
    @WebMethod(action = "urn:zimbraMail/BounceMsg")
    @WebResult(name = "BounceMsgResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public BounceMsgResponse bounceMsgRequest(
            @WebParam(name = "BounceMsgRequest", targetNamespace = "urn:zimbraMail", partName = "params") BounceMsgRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.BrowseResponse
     */
    @WebMethod(action = "urn:zimbraMail/Browse")
    @WebResult(name = "BrowseResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public BrowseResponse browseRequest(
            @WebParam(name = "BrowseRequest", targetNamespace = "urn:zimbraMail", partName = "params") BrowseRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CancelAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/CancelAppointment")
    @WebResult(name = "CancelAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CancelAppointmentResponse cancelAppointmentRequest(
            @WebParam(name = "CancelAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") CancelAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CancelTaskResponse
     */
    @WebMethod(action = "urn:zimbraMail/CancelTask")
    @WebResult(name = "CancelTaskResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CancelTaskResponse cancelTaskRequest(
            @WebParam(name = "CancelTaskRequest", targetNamespace = "urn:zimbraMail", partName = "params") CancelTaskRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CheckDeviceStatusResponse
     */
    @WebMethod(action = "urn:zimbraMail/CheckDeviceStatus")
    @WebResult(name = "CheckDeviceStatusResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CheckDeviceStatusResponse checkDeviceStatusRequest(
            @WebParam(name = "CheckDeviceStatusRequest", targetNamespace = "urn:zimbraMail", partName = "params") CheckDeviceStatusRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CheckPermissionResponse
     */
    @WebMethod(action = "urn:zimbraMail/CheckPermission")
    @WebResult(name = "CheckPermissionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CheckPermissionResponse checkPermissionRequest(
            @WebParam(name = "CheckPermissionRequest", targetNamespace = "urn:zimbraMail", partName = "params") CheckPermissionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CheckRecurConflictsResponse
     */
    @WebMethod(action = "urn:zimbraMail/CheckRecurConflicts")
    @WebResult(name = "CheckRecurConflictsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CheckRecurConflictsResponse checkRecurConflictsRequest(
            @WebParam(name = "CheckRecurConflictsRequest", targetNamespace = "urn:zimbraMail", partName = "params") CheckRecurConflictsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CheckSpellingResponse
     */
    @WebMethod(action = "urn:zimbraMail/CheckSpelling")
    @WebResult(name = "CheckSpellingResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CheckSpellingResponse checkSpellingRequest(
            @WebParam(name = "CheckSpellingRequest", targetNamespace = "urn:zimbraMail", partName = "params") CheckSpellingRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CompleteTaskInstanceResponse
     */
    @WebMethod(action = "urn:zimbraMail/CompleteTaskInstance")
    @WebResult(name = "CompleteTaskInstanceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CompleteTaskInstanceResponse completeTaskInstanceRequest(
            @WebParam(name = "CompleteTaskInstanceRequest", targetNamespace = "urn:zimbraMail", partName = "params") CompleteTaskInstanceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ContactActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/ContactAction")
    @WebResult(name = "ContactActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ContactActionResponse contactActionRequest(
            @WebParam(name = "ContactActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") ContactActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ConvActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/ConvAction")
    @WebResult(name = "ConvActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ConvActionResponse convActionRequest(
            @WebParam(name = "ConvActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") ConvActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CounterAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/CounterAppointment")
    @WebResult(name = "CounterAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CounterAppointmentResponse counterAppointmentRequest(
            @WebParam(name = "CounterAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") CounterAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateAppointmentExceptionResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateAppointmentException")
    @WebResult(name = "CreateAppointmentExceptionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateAppointmentExceptionResponse createAppointmentExceptionRequest(
            @WebParam(name = "CreateAppointmentExceptionRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateAppointmentExceptionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateAppointment")
    @WebResult(name = "CreateAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateAppointmentResponse createAppointmentRequest(
            @WebParam(name = "CreateAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateContactResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateContact")
    @WebResult(name = "CreateContactResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateContactResponse createContactRequest(
            @WebParam(name = "CreateContactRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateContactRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateDataSource")
    @WebResult(name = "CreateDataSourceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateDataSourceResponse createDataSourceRequest(
            @WebParam(name = "CreateDataSourceRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateDataSourceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateFolderResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateFolder")
    @WebResult(name = "CreateFolderResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateFolderResponse createFolderRequest(
            @WebParam(name = "CreateFolderRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateFolderRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateMountpointResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateMountpoint")
    @WebResult(name = "CreateMountpointResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateMountpointResponse createMountpointRequest(
            @WebParam(name = "CreateMountpointRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateMountpointRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateNoteResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateNote")
    @WebResult(name = "CreateNoteResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateNoteResponse createNoteRequest(
            @WebParam(name = "CreateNoteRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateNoteRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateSearchFolderResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateSearchFolder")
    @WebResult(name = "CreateSearchFolderResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateSearchFolderResponse createSearchFolderRequest(
            @WebParam(name = "CreateSearchFolderRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateSearchFolderRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateTagResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateTag")
    @WebResult(name = "CreateTagResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateTagResponse createTagRequest(
            @WebParam(name = "CreateTagRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateTagRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateTaskExceptionResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateTaskException")
    @WebResult(name = "CreateTaskExceptionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateTaskExceptionResponse createTaskExceptionRequest(
            @WebParam(name = "CreateTaskExceptionRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateTaskExceptionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateTaskResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateTask")
    @WebResult(name = "CreateTaskResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateTaskResponse createTaskRequest(
            @WebParam(name = "CreateTaskRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateTaskRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.CreateWaitSetResponse
     */
    @WebMethod(action = "urn:zimbraMail/CreateWaitSet")
    @WebResult(name = "CreateWaitSetResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public CreateWaitSetResponse createWaitSetRequest(
            @WebParam(name = "CreateWaitSetRequest", targetNamespace = "urn:zimbraMail", partName = "params") CreateWaitSetRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DeclineCounterAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/DeclineCounterAppointment")
    @WebResult(name = "DeclineCounterAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DeclineCounterAppointmentResponse declineCounterAppointmentRequest(
            @WebParam(name = "DeclineCounterAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") DeclineCounterAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DeleteDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraMail/DeleteDataSource")
    @WebResult(name = "DeleteDataSourceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DeleteDataSourceResponse deleteDataSourceRequest(
            @WebParam(name = "DeleteDataSourceRequest", targetNamespace = "urn:zimbraMail", partName = "params") DeleteDataSourceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DeleteDeviceResponse
     */
    @WebMethod(action = "urn:zimbraMail/DeleteDevice")
    @WebResult(name = "DeleteDeviceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DeleteDeviceResponse deleteDeviceRequest(
            @WebParam(name = "DeleteDeviceRequest", targetNamespace = "urn:zimbraMail", partName = "params") DeleteDeviceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DestroyWaitSetResponse
     */
    @WebMethod(action = "urn:zimbraMail/DestroyWaitSet")
    @WebResult(name = "DestroyWaitSetResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DestroyWaitSetResponse destroyWaitSetRequest(
            @WebParam(name = "DestroyWaitSetRequest", targetNamespace = "urn:zimbraMail", partName = "params") DestroyWaitSetRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DiffDocumentResponse
     */
    @WebMethod(action = "urn:zimbraMail/DiffDocument")
    @WebResult(name = "DiffDocumentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DiffDocumentResponse diffDocumentRequest(
            @WebParam(name = "DiffDocumentRequest", targetNamespace = "urn:zimbraMail", partName = "params") DiffDocumentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DismissCalendarItemAlarmResponse
     */
    @WebMethod(action = "urn:zimbraMail/DismissCalendarItemAlarm")
    @WebResult(name = "DismissCalendarItemAlarmResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DismissCalendarItemAlarmResponse dismissCalendarItemAlarmRequest(
            @WebParam(name = "DismissCalendarItemAlarmRequest", targetNamespace = "urn:zimbraMail", partName = "params") DismissCalendarItemAlarmRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.DocumentActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/DocumentAction")
    @WebResult(name = "DocumentActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public DocumentActionResponse documentActionRequest(
            @WebParam(name = "DocumentActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") DocumentActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.EmptyDumpsterResponse
     */
    @WebMethod(action = "urn:zimbraMail/EmptyDumpster")
    @WebResult(name = "EmptyDumpsterResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public EmptyDumpsterResponse emptyDumpsterRequest(
            @WebParam(name = "EmptyDumpsterRequest", targetNamespace = "urn:zimbraMail", partName = "params") EmptyDumpsterRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.EnableSharedReminderResponse
     */
    @WebMethod(action = "urn:zimbraMail/EnableSharedReminder")
    @WebResult(name = "EnableSharedReminderResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public EnableSharedReminderResponse enableSharedReminderRequest(
            @WebParam(name = "EnableSharedReminderRequest", targetNamespace = "urn:zimbraMail", partName = "params") EnableSharedReminderRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ExpandRecurResponse
     */
    @WebMethod(action = "urn:zimbraMail/ExpandRecur")
    @WebResult(name = "ExpandRecurResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ExpandRecurResponse expandRecurRequest(
            @WebParam(name = "ExpandRecurRequest", targetNamespace = "urn:zimbraMail", partName = "params") ExpandRecurRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ExportContactsResponse
     */
    @WebMethod(action = "urn:zimbraMail/ExportContacts")
    @WebResult(name = "ExportContactsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ExportContactsResponse exportContactsRequest(
            @WebParam(name = "ExportContactsRequest", targetNamespace = "urn:zimbraMail", partName = "params") ExportContactsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.FolderActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/FolderAction")
    @WebResult(name = "FolderActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public FolderActionResponse folderActionRequest(
            @WebParam(name = "FolderActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") FolderActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ForwardAppointmentInviteResponse
     */
    @WebMethod(action = "urn:zimbraMail/ForwardAppointmentInvite")
    @WebResult(name = "ForwardAppointmentInviteResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ForwardAppointmentInviteResponse forwardAppointmentInviteRequest(
            @WebParam(name = "ForwardAppointmentInviteRequest", targetNamespace = "urn:zimbraMail", partName = "params") ForwardAppointmentInviteRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ForwardAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/ForwardAppointment")
    @WebResult(name = "ForwardAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ForwardAppointmentResponse forwardAppointmentRequest(
            @WebParam(name = "ForwardAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") ForwardAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns java.lang.String
     */
    @WebMethod(action = "urn:zimbraMail/GenerateUUID")
    @WebResult(name = "GenerateUUIDResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public String generateUUIDRequest(
            @WebParam(name = "GenerateUUIDRequest", targetNamespace = "urn:zimbraMail", partName = "params") GenerateUUIDRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetActivityStreamResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetActivityStream")
    @WebResult(name = "GetActivityStreamResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetActivityStreamResponse getActivityStreamRequest(
            @WebParam(name = "GetActivityStreamRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetActivityStreamRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetAllDevicesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetAllDevices")
    @WebResult(name = "GetAllDevicesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetAllDevicesResponse getAllDevicesRequest(
            @WebParam(name = "GetAllDevicesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetAllDevicesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetAppointment")
    @WebResult(name = "GetAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetAppointmentResponse getAppointmentRequest(
            @WebParam(name = "GetAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetApptSummariesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetApptSummaries")
    @WebResult(name = "GetApptSummariesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetApptSummariesResponse getApptSummariesRequest(
            @WebParam(name = "GetApptSummariesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetApptSummariesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetCalendarItemSummariesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetCalendarItemSummaries")
    @WebResult(name = "GetCalendarItemSummariesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetCalendarItemSummariesResponse getCalendarItemSummariesRequest(
            @WebParam(name = "GetCalendarItemSummariesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetCalendarItemSummariesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetCommentsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetComments")
    @WebResult(name = "GetCommentsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetCommentsResponse getCommentsRequest(
            @WebParam(name = "GetCommentsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetCommentsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetContactsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetContacts")
    @WebResult(name = "GetContactsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetContactsResponse getContactsRequest(
            @WebParam(name = "GetContactsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetContactsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetConvResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetConv")
    @WebResult(name = "GetConvResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetConvResponse getConvRequest(
            @WebParam(name = "GetConvRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetConvRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetCustomMetadataResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetCustomMetadata")
    @WebResult(name = "GetCustomMetadataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetCustomMetadataResponse getCustomMetadataRequest(
            @WebParam(name = "GetCustomMetadataRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetCustomMetadataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetDataSourcesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetDataSources")
    @WebResult(name = "GetDataSourcesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetDataSourcesResponse getDataSourcesRequest(
            @WebParam(name = "GetDataSourcesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetDataSourcesRequest params);

    /**
     *
     * @param params
     * @return returns java.lang.String
     */
    @WebMethod(action = "urn:zimbraMail/GetDocumentShareURL")
    @WebResult(name = "GetDocumentShareURLResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public String getDocumentShareURLRequest(
            @WebParam(name = "GetDocumentShareURLRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetDocumentShareURLRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetEffectiveFolderPermsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetEffectiveFolderPerms")
    @WebResult(name = "GetEffectiveFolderPermsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetEffectiveFolderPermsResponse getEffectiveFolderPermsRequest(
            @WebParam(name = "GetEffectiveFolderPermsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetEffectiveFolderPermsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetFilterRulesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetFilterRules")
    @WebResult(name = "GetFilterRulesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetFilterRulesResponse getFilterRulesRequest(
            @WebParam(name = "GetFilterRulesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetFilterRulesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetFolderResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetFolder")
    @WebResult(name = "GetFolderResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetFolderResponse getFolderRequest(
            @WebParam(name = "GetFolderRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetFolderRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetFreeBusyResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetFreeBusy")
    @WebResult(name = "GetFreeBusyResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetFreeBusyResponse getFreeBusyRequest(
            @WebParam(name = "GetFreeBusyRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetFreeBusyRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetICalResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetICal")
    @WebResult(name = "GetICalResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetICalResponse getICalRequest(
            @WebParam(name = "GetICalRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetICalRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetImportStatusResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetImportStatus")
    @WebResult(name = "GetImportStatusResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetImportStatusResponse getImportStatusRequest(
            @WebParam(name = "GetImportStatusRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetImportStatusRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetItemResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetItem")
    @WebResult(name = "GetItemResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetItemResponse getItemRequest(
            @WebParam(name = "GetItemRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetItemRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetMailboxMetadataResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetMailboxMetadata")
    @WebResult(name = "GetMailboxMetadataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetMailboxMetadataResponse getMailboxMetadataRequest(
            @WebParam(name = "GetMailboxMetadataRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetMailboxMetadataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetMiniCalResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetMiniCal")
    @WebResult(name = "GetMiniCalResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetMiniCalResponse getMiniCalRequest(
            @WebParam(name = "GetMiniCalRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetMiniCalRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetMsgMetadataResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetMsgMetadata")
    @WebResult(name = "GetMsgMetadataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetMsgMetadataResponse getMsgMetadataRequest(
            @WebParam(name = "GetMsgMetadataRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetMsgMetadataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetMsgResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetMsg")
    @WebResult(name = "GetMsgResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetMsgResponse getMsgRequest(
            @WebParam(name = "GetMsgRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetMsgRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetNoteResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetNote")
    @WebResult(name = "GetNoteResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetNoteResponse getNoteRequest(
            @WebParam(name = "GetNoteRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetNoteRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetNotificationsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetNotifications")
    @WebResult(name = "GetNotificationsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetNotificationsResponse getNotificationsRequest(
            @WebParam(name = "GetNotificationsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetNotificationsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetOutgoingFilterRulesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetOutgoingFilterRules")
    @WebResult(name = "GetOutgoingFilterRulesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetOutgoingFilterRulesResponse getOutgoingFilterRulesRequest(
            @WebParam(name = "GetOutgoingFilterRulesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetOutgoingFilterRulesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetPermissionResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetPermission")
    @WebResult(name = "GetPermissionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetPermissionResponse getPermissionRequest(
            @WebParam(name = "GetPermissionRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetPermissionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetRecurResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetRecur")
    @WebResult(name = "GetRecurResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetRecurResponse getRecurRequest(
            @WebParam(name = "GetRecurRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetRecurRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetSearchFolderResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetSearchFolder")
    @WebResult(name = "GetSearchFolderResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetSearchFolderResponse getSearchFolderRequest(
            @WebParam(name = "GetSearchFolderRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetSearchFolderRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetShareDetailsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetShareDetails")
    @WebResult(name = "GetShareDetailsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetShareDetailsResponse getShareDetailsRequest(
            @WebParam(name = "GetShareDetailsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetShareDetailsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetShareNotificationsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetShareNotifications")
    @WebResult(name = "GetShareNotificationsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetShareNotificationsResponse getShareNotificationsRequest(
            @WebParam(name = "GetShareNotificationsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetShareNotificationsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetSpellDictionariesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetSpellDictionaries")
    @WebResult(name = "GetSpellDictionariesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetSpellDictionariesResponse getSpellDictionariesRequest(
            @WebParam(name = "GetSpellDictionariesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetSpellDictionariesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetSystemRetentionPolicyResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetSystemRetentionPolicy")
    @WebResult(name = "GetSystemRetentionPolicyResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetSystemRetentionPolicyResponse getSystemRetentionPolicyRequest(
            @WebParam(name = "GetSystemRetentionPolicyRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetSystemRetentionPolicyRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetTagResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetTag")
    @WebResult(name = "GetTagResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetTagResponse getTagRequest(
            @WebParam(name = "GetTagRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetTagRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetTaskResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetTask")
    @WebResult(name = "GetTaskResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetTaskResponse getTaskRequest(
            @WebParam(name = "GetTaskRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetTaskRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetTaskSummariesResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetTaskSummaries")
    @WebResult(name = "GetTaskSummariesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetTaskSummariesResponse getTaskSummariesRequest(
            @WebParam(name = "GetTaskSummariesRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetTaskSummariesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetWatchersResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetWatchers")
    @WebResult(name = "GetWatchersResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetWatchersResponse getWatchersRequest(
            @WebParam(name = "GetWatchersRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetWatchersRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetWatchingItemsResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetWatchingItems")
    @WebResult(name = "GetWatchingItemsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetWatchingItemsResponse getWatchingItemsRequest(
            @WebParam(name = "GetWatchingItemsRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetWatchingItemsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetWorkingHoursResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetWorkingHours")
    @WebResult(name = "GetWorkingHoursResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetWorkingHoursResponse getWorkingHoursRequest(
            @WebParam(name = "GetWorkingHoursRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetWorkingHoursRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetYahooAuthTokenResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetYahooAuthToken")
    @WebResult(name = "GetYahooAuthTokenResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetYahooAuthTokenResponse getYahooAuthTokenRequest(
            @WebParam(name = "GetYahooAuthTokenRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetYahooAuthTokenRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GetYahooCookieResponse
     */
    @WebMethod(action = "urn:zimbraMail/GetYahooCookie")
    @WebResult(name = "GetYahooCookieResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GetYahooCookieResponse getYahooCookieRequest(
            @WebParam(name = "GetYahooCookieRequest", targetNamespace = "urn:zimbraMail", partName = "params") GetYahooCookieRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.GrantPermissionResponse
     */
    @WebMethod(action = "urn:zimbraMail/GrantPermission")
    @WebResult(name = "GrantPermissionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public GrantPermissionResponse grantPermissionRequest(
            @WebParam(name = "GrantPermissionRequest", targetNamespace = "urn:zimbraMail", partName = "params") GrantPermissionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ICalReplyResponse
     */
    @WebMethod(action = "urn:zimbraMail/ICalReply")
    @WebResult(name = "ICalReplyResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ICalReplyResponse iCalReplyRequest(
            @WebParam(name = "ICalReplyRequest", targetNamespace = "urn:zimbraMail", partName = "params") ICalReplyRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ImportAppointmentsResponse
     */
    @WebMethod(action = "urn:zimbraMail/ImportAppointments")
    @WebResult(name = "ImportAppointmentsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ImportAppointmentsResponse importAppointmentsRequest(
            @WebParam(name = "ImportAppointmentsRequest", targetNamespace = "urn:zimbraMail", partName = "params") ImportAppointmentsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ImportContactsResponse
     */
    @WebMethod(action = "urn:zimbraMail/ImportContacts")
    @WebResult(name = "ImportContactsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ImportContactsResponse importContactsRequest(
            @WebParam(name = "ImportContactsRequest", targetNamespace = "urn:zimbraMail", partName = "params") ImportContactsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ImportDataResponse
     */
    @WebMethod(action = "urn:zimbraMail/ImportData")
    @WebResult(name = "ImportDataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ImportDataResponse importDataRequest(
            @WebParam(name = "ImportDataRequest", targetNamespace = "urn:zimbraMail", partName = "params") ImportDataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.InvalidateReminderDeviceResponse
     */
    @WebMethod(action = "urn:zimbraMail/InvalidateReminderDevice")
    @WebResult(name = "InvalidateReminderDeviceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public InvalidateReminderDeviceResponse invalidateReminderDeviceRequest(
            @WebParam(name = "InvalidateReminderDeviceRequest", targetNamespace = "urn:zimbraMail", partName = "params") InvalidateReminderDeviceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ItemActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/ItemAction")
    @WebResult(name = "ItemActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ItemActionResponse itemActionRequest(
            @WebParam(name = "ItemActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") ItemActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ListDocumentRevisionsResponse
     */
    @WebMethod(action = "urn:zimbraMail/ListDocumentRevisions")
    @WebResult(name = "ListDocumentRevisionsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ListDocumentRevisionsResponse listDocumentRevisionsRequest(
            @WebParam(name = "ListDocumentRevisionsRequest", targetNamespace = "urn:zimbraMail", partName = "params") ListDocumentRevisionsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyAppointment")
    @WebResult(name = "ModifyAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyAppointmentResponse modifyAppointmentRequest(
            @WebParam(name = "ModifyAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyContactResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyContact")
    @WebResult(name = "ModifyContactResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyContactResponse modifyContactRequest(
            @WebParam(name = "ModifyContactRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyContactRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyDataSource")
    @WebResult(name = "ModifyDataSourceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyDataSourceResponse modifyDataSourceRequest(
            @WebParam(name = "ModifyDataSourceRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyDataSourceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyFilterRulesResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyFilterRules")
    @WebResult(name = "ModifyFilterRulesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyFilterRulesResponse modifyFilterRulesRequest(
            @WebParam(name = "ModifyFilterRulesRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyFilterRulesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyMailboxMetadataResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyMailboxMetadata")
    @WebResult(name = "ModifyMailboxMetadataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyMailboxMetadataResponse modifyMailboxMetadataRequest(
            @WebParam(name = "ModifyMailboxMetadataRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyMailboxMetadataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyOutgoingFilterRulesResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyOutgoingFilterRules")
    @WebResult(name = "ModifyOutgoingFilterRulesResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyOutgoingFilterRulesResponse modifyOutgoingFilterRulesRequest(
            @WebParam(name = "ModifyOutgoingFilterRulesRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyOutgoingFilterRulesRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifySearchFolderResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifySearchFolder")
    @WebResult(name = "ModifySearchFolderResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifySearchFolderResponse modifySearchFolderRequest(
            @WebParam(name = "ModifySearchFolderRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifySearchFolderRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.ModifyTaskResponse
     */
    @WebMethod(action = "urn:zimbraMail/ModifyTask")
    @WebResult(name = "ModifyTaskResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public ModifyTaskResponse modifyTaskRequest(
            @WebParam(name = "ModifyTaskRequest", targetNamespace = "urn:zimbraMail", partName = "params") ModifyTaskRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.MsgActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/MsgAction")
    @WebResult(name = "MsgActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public MsgActionResponse msgActionRequest(
            @WebParam(name = "MsgActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") MsgActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.NoOpResponse
     */
    @WebMethod(action = "urn:zimbraMail/NoOp")
    @WebResult(name = "NoOpResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public NoOpResponse noOpRequest(
            @WebParam(name = "NoOpRequest", targetNamespace = "urn:zimbraMail", partName = "params") NoOpRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.NoteActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/NoteAction")
    @WebResult(name = "NoteActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public NoteActionResponse noteActionRequest(
            @WebParam(name = "NoteActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") NoteActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.PurgeRevisionResponse
     */
    @WebMethod(action = "urn:zimbraMail/PurgeRevision")
    @WebResult(name = "PurgeRevisionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public PurgeRevisionResponse purgeRevisionRequest(
            @WebParam(name = "PurgeRevisionRequest", targetNamespace = "urn:zimbraMail", partName = "params") PurgeRevisionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.RankingActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/RankingAction")
    @WebResult(name = "RankingActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public RankingActionResponse rankingActionRequest(
            @WebParam(name = "RankingActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") RankingActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.RegisterDeviceResponse
     */
    @WebMethod(action = "urn:zimbraMail/RegisterDevice")
    @WebResult(name = "RegisterDeviceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public RegisterDeviceResponse registerDeviceRequest(
            @WebParam(name = "RegisterDeviceRequest", targetNamespace = "urn:zimbraMail", partName = "params") RegisterDeviceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.RemoveAttachmentsResponse
     */
    @WebMethod(action = "urn:zimbraMail/RemoveAttachments")
    @WebResult(name = "RemoveAttachmentsResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public RemoveAttachmentsResponse removeAttachmentsRequest(
            @WebParam(name = "RemoveAttachmentsRequest", targetNamespace = "urn:zimbraMail", partName = "params") RemoveAttachmentsRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.RevokePermissionResponse
     */
    @WebMethod(action = "urn:zimbraMail/RevokePermission")
    @WebResult(name = "RevokePermissionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public RevokePermissionResponse revokePermissionRequest(
            @WebParam(name = "RevokePermissionRequest", targetNamespace = "urn:zimbraMail", partName = "params") RevokePermissionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SaveDocumentResponse
     */
    @WebMethod(action = "urn:zimbraMail/SaveDocument")
    @WebResult(name = "SaveDocumentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SaveDocumentResponse saveDocumentRequest(
            @WebParam(name = "SaveDocumentRequest", targetNamespace = "urn:zimbraMail", partName = "params") SaveDocumentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SaveDraftResponse
     */
    @WebMethod(action = "urn:zimbraMail/SaveDraft")
    @WebResult(name = "SaveDraftResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SaveDraftResponse saveDraftRequest(
            @WebParam(name = "SaveDraftRequest", targetNamespace = "urn:zimbraMail", partName = "params") SaveDraftRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SearchConvResponse
     */
    @WebMethod(action = "urn:zimbraMail/SearchConv")
    @WebResult(name = "SearchConvResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SearchConvResponse searchConvRequest(
            @WebParam(name = "SearchConvRequest", targetNamespace = "urn:zimbraMail", partName = "params") SearchConvRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SearchResponse
     */
    @WebMethod(action = "urn:zimbraMail/Search")
    @WebResult(name = "SearchResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SearchResponse searchRequest(
            @WebParam(name = "SearchRequest", targetNamespace = "urn:zimbraMail", partName = "params") SearchRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SendDeliveryReportResponse
     */
    @WebMethod(action = "urn:zimbraMail/SendDeliveryReport")
    @WebResult(name = "SendDeliveryReportResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SendDeliveryReportResponse sendDeliveryReportRequest(
            @WebParam(name = "SendDeliveryReportRequest", targetNamespace = "urn:zimbraMail", partName = "params") SendDeliveryReportRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SendInviteReplyResponse
     */
    @WebMethod(action = "urn:zimbraMail/SendInviteReply")
    @WebResult(name = "SendInviteReplyResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SendInviteReplyResponse sendInviteReplyRequest(
            @WebParam(name = "SendInviteReplyRequest", targetNamespace = "urn:zimbraMail", partName = "params") SendInviteReplyRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SendMsgResponse
     */
    @WebMethod(action = "urn:zimbraMail/SendMsg")
    @WebResult(name = "SendMsgResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SendMsgResponse sendMsgRequest(
            @WebParam(name = "SendMsgRequest", targetNamespace = "urn:zimbraMail", partName = "params") SendMsgRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SendShareNotificationResponse
     */
    @WebMethod(action = "urn:zimbraMail/SendShareNotification")
    @WebResult(name = "SendShareNotificationResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SendShareNotificationResponse sendShareNotificationRequest(
            @WebParam(name = "SendShareNotificationRequest", targetNamespace = "urn:zimbraMail", partName = "params") SendShareNotificationRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SendVerificationCodeResponse
     */
    @WebMethod(action = "urn:zimbraMail/SendVerificationCode")
    @WebResult(name = "SendVerificationCodeResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SendVerificationCodeResponse sendVerificationCodeRequest(
            @WebParam(name = "SendVerificationCodeRequest", targetNamespace = "urn:zimbraMail", partName = "params") SendVerificationCodeRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SetAppointmentResponse
     */
    @WebMethod(action = "urn:zimbraMail/SetAppointment")
    @WebResult(name = "SetAppointmentResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SetAppointmentResponse setAppointmentRequest(
            @WebParam(name = "SetAppointmentRequest", targetNamespace = "urn:zimbraMail", partName = "params") SetAppointmentRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SetCustomMetadataResponse
     */
    @WebMethod(action = "urn:zimbraMail/SetCustomMetadata")
    @WebResult(name = "SetCustomMetadataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SetCustomMetadataResponse setCustomMetadataRequest(
            @WebParam(name = "SetCustomMetadataRequest", targetNamespace = "urn:zimbraMail", partName = "params") SetCustomMetadataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SetMailboxMetadataResponse
     */
    @WebMethod(action = "urn:zimbraMail/SetMailboxMetadata")
    @WebResult(name = "SetMailboxMetadataResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SetMailboxMetadataResponse setMailboxMetadataRequest(
            @WebParam(name = "SetMailboxMetadataRequest", targetNamespace = "urn:zimbraMail", partName = "params") SetMailboxMetadataRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SetTaskResponse
     */
    @WebMethod(action = "urn:zimbraMail/SetTask")
    @WebResult(name = "SetTaskResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SetTaskResponse setTaskRequest(
            @WebParam(name = "SetTaskRequest", targetNamespace = "urn:zimbraMail", partName = "params") SetTaskRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SnoozeCalendarItemAlarmResponse
     */
    @WebMethod(action = "urn:zimbraMail/SnoozeCalendarItemAlarm")
    @WebResult(name = "SnoozeCalendarItemAlarmResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SnoozeCalendarItemAlarmResponse snoozeCalendarItemAlarmRequest(
            @WebParam(name = "SnoozeCalendarItemAlarmRequest", targetNamespace = "urn:zimbraMail", partName = "params") SnoozeCalendarItemAlarmRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.SyncResponse
     */
    @WebMethod(action = "urn:zimbraMail/Sync")
    @WebResult(name = "SyncResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public SyncResponse syncRequest(
            @WebParam(name = "SyncRequest", targetNamespace = "urn:zimbraMail", partName = "params") SyncRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.TagActionResponse
     */
    @WebMethod(action = "urn:zimbraMail/TagAction")
    @WebResult(name = "TagActionResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public TagActionResponse tagActionRequest(
            @WebParam(name = "TagActionRequest", targetNamespace = "urn:zimbraMail", partName = "params") TagActionRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.TestDataSourceResponse
     */
    @WebMethod(action = "urn:zimbraMail/TestDataSource")
    @WebResult(name = "TestDataSourceResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public TestDataSourceResponse testDataSourceRequest(
            @WebParam(name = "TestDataSourceRequest", targetNamespace = "urn:zimbraMail", partName = "params") TestDataSourceRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.UpdateDeviceStatusResponse
     */
    @WebMethod(action = "urn:zimbraMail/UpdateDeviceStatus")
    @WebResult(name = "UpdateDeviceStatusResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public UpdateDeviceStatusResponse updateDeviceStatusRequest(
            @WebParam(name = "UpdateDeviceStatusRequest", targetNamespace = "urn:zimbraMail", partName = "params") UpdateDeviceStatusRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.VerifyCodeResponse
     */
    @WebMethod(action = "urn:zimbraMail/VerifyCode")
    @WebResult(name = "VerifyCodeResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public VerifyCodeResponse verifyCodeRequest(
            @WebParam(name = "VerifyCodeRequest", targetNamespace = "urn:zimbraMail", partName = "params") VerifyCodeRequest params);

    /**
     *
     * @param params
     * @return returns zimbramail.WaitSetResponse
     */
    @WebMethod(action = "urn:zimbraMail/WaitSet")
    @WebResult(name = "WaitSetResponse", targetNamespace = "urn:zimbraMail", partName = "params")
    public WaitSetResponse waitSetRequest(
            @WebParam(name = "WaitSetRequest", targetNamespace = "urn:zimbraMail", partName = "params") WaitSetRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.BecomeMasterResponse
     */
    @WebMethod(action = "urn:zimbraRepl/BecomeMaster")
    @WebResult(name = "BecomeMasterResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public BecomeMasterResponse becomeMasterRequest(
            @WebParam(name = "BecomeMasterRequest", targetNamespace = "urn:zimbraRepl", partName = "params") BecomeMasterRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.BringDownServiceIPResponse
     */
    @WebMethod(action = "urn:zimbraRepl/BringDownServiceIP")
    @WebResult(name = "BringDownServiceIPResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public BringDownServiceIPResponse bringDownServiceIPRequest(
            @WebParam(name = "BringDownServiceIPRequest", targetNamespace = "urn:zimbraRepl", partName = "params") BringDownServiceIPRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.BringUpServiceIPResponse
     */
    @WebMethod(action = "urn:zimbraRepl/BringUpServiceIP")
    @WebResult(name = "BringUpServiceIPResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public BringUpServiceIPResponse bringUpServiceIPRequest(
            @WebParam(name = "BringUpServiceIPRequest", targetNamespace = "urn:zimbraRepl", partName = "params") BringUpServiceIPRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.ReplicationStatusResponse
     */
    @WebMethod(action = "urn:zimbraRepl/ReplicationStatus")
    @WebResult(name = "ReplicationStatusResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public ReplicationStatusResponse replicationStatusRequest(
            @WebParam(name = "ReplicationStatusRequest", targetNamespace = "urn:zimbraRepl", partName = "params") ReplicationStatusRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.StartCatchupResponse
     */
    @WebMethod(action = "urn:zimbraRepl/StartCatchup")
    @WebResult(name = "StartCatchupResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public StartCatchupResponse startCatchupRequest(
            @WebParam(name = "StartCatchupRequest", targetNamespace = "urn:zimbraRepl", partName = "params") StartCatchupRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.StartFailoverClientResponse
     */
    @WebMethod(action = "urn:zimbraRepl/StartFailoverClient")
    @WebResult(name = "StartFailoverClientResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public StartFailoverClientResponse startFailoverClientRequest(
            @WebParam(name = "StartFailoverClientRequest", targetNamespace = "urn:zimbraRepl", partName = "params") StartFailoverClientRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.StartFailoverDaemonResponse
     */
    @WebMethod(action = "urn:zimbraRepl/StartFailoverDaemon")
    @WebResult(name = "StartFailoverDaemonResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public StartFailoverDaemonResponse startFailoverDaemonRequest(
            @WebParam(name = "StartFailoverDaemonRequest", targetNamespace = "urn:zimbraRepl", partName = "params") StartFailoverDaemonRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.StopFailoverClientResponse
     */
    @WebMethod(action = "urn:zimbraRepl/StopFailoverClient")
    @WebResult(name = "StopFailoverClientResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public StopFailoverClientResponse stopFailoverClientRequest(
            @WebParam(name = "StopFailoverClientRequest", targetNamespace = "urn:zimbraRepl", partName = "params") StopFailoverClientRequest params);

    /**
     *
     * @param params
     * @return returns zimbrarepl.StopFailoverDaemonResponse
     */
    @WebMethod(action = "urn:zimbraRepl/StopFailoverDaemon")
    @WebResult(name = "StopFailoverDaemonResponse", targetNamespace = "urn:zimbraRepl", partName = "params")
    public StopFailoverDaemonResponse stopFailoverDaemonRequest(
            @WebParam(name = "StopFailoverDaemonRequest", targetNamespace = "urn:zimbraRepl", partName = "params") StopFailoverDaemonRequest params);

    /**
     *
     * @param params
     * @return returns zimbrasync.CancelPendingRemoteWipeResponse
     */
    @WebMethod(action = "urn:zimbraSync/CancelPendingRemoteWipe")
    @WebResult(name = "CancelPendingRemoteWipeResponse", targetNamespace = "urn:zimbraSync", partName = "params")
    public CancelPendingRemoteWipeResponse cancelPendingRemoteWipeRequest(
            @WebParam(name = "CancelPendingRemoteWipeRequest", targetNamespace = "urn:zimbraSync", partName = "params") CancelPendingRemoteWipeRequest params);

    /**
     *
     * @param params
     * @return returns zimbrasync.GetDeviceStatusResponse
     */
    @WebMethod(action = "urn:zimbraSync/GetDeviceStatus")
    @WebResult(name = "GetDeviceStatusResponse", targetNamespace = "urn:zimbraSync", partName = "params")
    public GetDeviceStatusResponse getDeviceStatusRequest(
            @WebParam(name = "GetDeviceStatusRequest", targetNamespace = "urn:zimbraSync", partName = "params") GetDeviceStatusRequest params);

    /**
     *
     * @param params
     * @return returns zimbrasync.RemoteWipeResponse
     */
    @WebMethod(action = "urn:zimbraSync/RemoteWipe")
    @WebResult(name = "RemoteWipeResponse", targetNamespace = "urn:zimbraSync", partName = "params")
    public RemoteWipeResponse remoteWipeRequest(
            @WebParam(name = "RemoteWipeRequest", targetNamespace = "urn:zimbraSync", partName = "params") RemoteWipeRequest params);

    /**
     *
     * @param params
     * @return returns zimbrasync.RemoveDeviceResponse
     */
    @WebMethod(action = "urn:zimbraSync/RemoveDevice")
    @WebResult(name = "RemoveDeviceResponse", targetNamespace = "urn:zimbraSync", partName = "params")
    public RemoveDeviceResponse removeDeviceRequest(
            @WebParam(name = "RemoveDeviceRequest", targetNamespace = "urn:zimbraSync", partName = "params") RemoveDeviceRequest params);

    /**
     *
     * @param params
     * @return returns zimbrasync.ResumeDeviceResponse
     */
    @WebMethod(action = "urn:zimbraSync/ResumeDevice")
    @WebResult(name = "ResumeDeviceResponse", targetNamespace = "urn:zimbraSync", partName = "params")
    public ResumeDeviceResponse resumeDeviceRequest(
            @WebParam(name = "ResumeDeviceRequest", targetNamespace = "urn:zimbraSync", partName = "params") ResumeDeviceRequest params);

    /**
     *
     * @param params
     * @return returns zimbrasync.SuspendDeviceResponse
     */
    @WebMethod(action = "urn:zimbraSync/SuspendDevice")
    @WebResult(name = "SuspendDeviceResponse", targetNamespace = "urn:zimbraSync", partName = "params")
    public SuspendDeviceResponse suspendDeviceRequest(
            @WebParam(name = "SuspendDeviceRequest", targetNamespace = "urn:zimbraSync", partName = "params") SuspendDeviceRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.ChangeUCPasswordResponse
     */
    @WebMethod(action = "urn:zimbraVoice/ChangeUCPassword")
    @WebResult(name = "ChangeUCPasswordResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public ChangeUCPasswordResponse changeUCPasswordRequest(
            @WebParam(name = "ChangeUCPasswordRequest", targetNamespace = "urn:zimbraVoice", partName = "params") ChangeUCPasswordRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.GetUCInfoResponse
     */
    @WebMethod(action = "urn:zimbraVoice/GetUCInfo")
    @WebResult(name = "GetUCInfoResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public GetUCInfoResponse getUCInfoRequest(
            @WebParam(name = "GetUCInfoRequest", targetNamespace = "urn:zimbraVoice", partName = "params") GetUCInfoRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.GetVoiceFeaturesResponse
     */
    @WebMethod(action = "urn:zimbraVoice/GetVoiceFeatures")
    @WebResult(name = "GetVoiceFeaturesResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public GetVoiceFeaturesResponse getVoiceFeaturesRequest(
            @WebParam(name = "GetVoiceFeaturesRequest", targetNamespace = "urn:zimbraVoice", partName = "params") GetVoiceFeaturesRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.GetVoiceFolderResponse
     */
    @WebMethod(action = "urn:zimbraVoice/GetVoiceFolder")
    @WebResult(name = "GetVoiceFolderResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public GetVoiceFolderResponse getVoiceFolderRequest(
            @WebParam(name = "GetVoiceFolderRequest", targetNamespace = "urn:zimbraVoice", partName = "params") GetVoiceFolderRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.GetVoiceInfoResponse
     */
    @WebMethod(action = "urn:zimbraVoice/GetVoiceInfo")
    @WebResult(name = "GetVoiceInfoResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public GetVoiceInfoResponse getVoiceInfoRequest(
            @WebParam(name = "GetVoiceInfoRequest", targetNamespace = "urn:zimbraVoice", partName = "params") GetVoiceInfoRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.GetVoiceMailPrefsResponse
     */
    @WebMethod(action = "urn:zimbraVoice/GetVoiceMailPrefs")
    @WebResult(name = "GetVoiceMailPrefsResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public GetVoiceMailPrefsResponse getVoiceMailPrefsRequest(
            @WebParam(name = "GetVoiceMailPrefsRequest", targetNamespace = "urn:zimbraVoice", partName = "params") GetVoiceMailPrefsRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.ModifyFromNumResponse
     */
    @WebMethod(action = "urn:zimbraVoice/ModifyFromNum")
    @WebResult(name = "ModifyFromNumResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public ModifyFromNumResponse modifyFromNumRequest(
            @WebParam(name = "ModifyFromNumRequest", targetNamespace = "urn:zimbraVoice", partName = "params") ModifyFromNumRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.ModifyVoiceFeaturesResponse
     */
    @WebMethod(action = "urn:zimbraVoice/ModifyVoiceFeatures")
    @WebResult(name = "ModifyVoiceFeaturesResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public ModifyVoiceFeaturesResponse modifyVoiceFeaturesRequest(
            @WebParam(name = "ModifyVoiceFeaturesRequest", targetNamespace = "urn:zimbraVoice", partName = "params") ModifyVoiceFeaturesRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.ModifyVoiceMailPinResponse
     */
    @WebMethod(action = "urn:zimbraVoice/ModifyVoiceMailPin")
    @WebResult(name = "ModifyVoiceMailPinResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public ModifyVoiceMailPinResponse modifyVoiceMailPinRequest(
            @WebParam(name = "ModifyVoiceMailPinRequest", targetNamespace = "urn:zimbraVoice", partName = "params") ModifyVoiceMailPinRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.ModifyVoiceMailPrefsResponse
     */
    @WebMethod(action = "urn:zimbraVoice/ModifyVoiceMailPrefs")
    @WebResult(name = "ModifyVoiceMailPrefsResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public ModifyVoiceMailPrefsResponse modifyVoiceMailPrefsRequest(
            @WebParam(name = "ModifyVoiceMailPrefsRequest", targetNamespace = "urn:zimbraVoice", partName = "params") ModifyVoiceMailPrefsRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.ResetVoiceFeaturesResponse
     */
    @WebMethod(action = "urn:zimbraVoice/ResetVoiceFeatures")
    @WebResult(name = "ResetVoiceFeaturesResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public ResetVoiceFeaturesResponse resetVoiceFeaturesRequest(
            @WebParam(name = "ResetVoiceFeaturesRequest", targetNamespace = "urn:zimbraVoice", partName = "params") ResetVoiceFeaturesRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.SearchVoiceResponse
     */
    @WebMethod(action = "urn:zimbraVoice/SearchVoice")
    @WebResult(name = "SearchVoiceResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public SearchVoiceResponse searchVoiceRequest(
            @WebParam(name = "SearchVoiceRequest", targetNamespace = "urn:zimbraVoice", partName = "params") SearchVoiceRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.UploadVoiceMailResponse
     */
    @WebMethod(action = "urn:zimbraVoice/UploadVoiceMail")
    @WebResult(name = "UploadVoiceMailResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public UploadVoiceMailResponse uploadVoiceMailRequest(
            @WebParam(name = "UploadVoiceMailRequest", targetNamespace = "urn:zimbraVoice", partName = "params") UploadVoiceMailRequest params);

    /**
     *
     * @param params
     * @return returns zimbravoice.VoiceMsgActionResponse
     */
    @WebMethod(action = "urn:zimbraVoice/VoiceMsgAction")
    @WebResult(name = "VoiceMsgActionResponse", targetNamespace = "urn:zimbraVoice", partName = "params")
    public VoiceMsgActionResponse voiceMsgActionRequest(
            @WebParam(name = "VoiceMsgActionRequest", targetNamespace = "urn:zimbraVoice", partName = "params") VoiceMsgActionRequest params);

}
