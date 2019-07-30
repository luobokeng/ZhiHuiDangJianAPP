package com.lfc.zhihuidangjianapp.net.http;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface HttpService {
    @POST(ApiConstant.LOGIN)
    Observable<String> LOGIN(@QueryMap Map<String, String> map);


    @GET(ApiConstant.loginCaptcha)
    Observable<String> loginCaptcha(@QueryMap Map<String, String> map);

    @GET(ApiConstant.queryHomeNoticeAnnouncementPageList)
    Observable<String> queryHomeNoticeAnnouncementPageList(@Header("token") String token);

    @POST(ApiConstant.queryAppConfigList)
    Observable<String> queryAppConfigList(@Header("token") String token);

    @POST(ApiConstant.queryNoticeAnnouncementDetail)
    Observable<String> queryNoticeAnnouncementDetail(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryNoticeAnnouncementPageList)
    Observable<String> queryNoticeAnnouncementPageList(@Header("token") String token);

    @POST(ApiConstant.queryUserListByFirstPinYin)
    Observable<String> queryUserListByFirstPinYin(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryLeadDemonstrationPageList)
    Observable<String> queryLeadDemonstrationPageList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryMyPartyPaymentHisPageList)
    Observable<String> queryMyPartyPaymentHisPageList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryJoinPartyStageDeatil)
    Observable<String> queryJoinPartyStageDeatil(@Header("token") String token);


    @POST(ApiConstant.queryPartyPaymentHisPageList)
    Observable<String> queryPartyPaymentHisPageList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryUnPaidPartyPaymentHisPageList)
    Observable<String> queryUnPaidPartyPaymentHisPageList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryDeptList)
    Observable<String> queryDeptList(@Header("token") String token);

    @POST(ApiConstant.queryPartyDynamicPageList)
    Observable<String> queryPartyDynamicPageList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryStudyStrongBureauPageList)
    Observable<String> queryStudyStrongBureauPageList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryDeptDetail)
    Observable<String> queryDeptDetail(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryDeptGroupList)
    Observable<String> queryDeptGroupList(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryUserListByDeptNumber)
    Observable<String> queryUserListByDeptNumber(@QueryMap Map<String, String> map, @Header("token") String token);

    @POST(ApiConstant.queryOrganizationalLifePageList)
    Observable<String> queryOrganizationalLifePageList(@QueryMap Map<String, String> map, @Header("token") String token);
}