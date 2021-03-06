package com.lfc.zhihuidangjianapp.net.http;

public class ApiConstant {
    //正试环境
//    public static final String ROOT_URL = "http://183.203.31.103:8081/";
//    测试环境
    public static final String ROOT_URL = "http://119.3.248.222:8080/";
    //登录
    public static final String LOGIN = "login/login";
    // 获取验证码
    public static final String loginCaptcha = "login/captcha";
    //分页公告信息
    public static final String queryHomeNoticeAnnouncementPageList = "appApi/queryHomeNoticeAnnouncementPageList";
    // app-Banner
    public static final String queryAppConfigList = "appApi/queryAppConfigList";
    // 查看公告详情信息
    public static final String queryNoticeAnnouncementDetail = "appApi/queryNoticeAnnouncementDetail";
    // 查看公告详情信息
    public static final String queryNoticeAnnouncementPageList = "appApi/queryNoticeAnnouncementPageList";
    // 通讯录-按首字母查询
    public static final String queryUserListByFirstPinYin = "appApi/queryUserListByFirstPinYin";
    // 专题专栏
    public static final String queryLeadDemonstrationPageList = "appApi/queryLeadDemonstrationPageList";
    // 我的党费
    public static final String queryMyPartyPaymentHisPageList = "appApi/queryMyPartyPaymentHisPageList";
    // 查询发展党员信息
    public static final String queryJoinPartyStageDeatil = "appApi/queryJoinPartyStageDeatil";
    // 分页查询党费缴费记录信息-已缴列表
    public static final String queryPartyPaymentHisPageList = "appApi/queryPartyPaymentHisPageList";
    // 分页查询党费缴费记录信息-本月未缴列表
    public static final String queryUnPaidPartyPaymentHisPageList = "appApi/queryUnPaidPartyPaymentHisPageList";
    // 党建矩阵
    public static final String queryDeptList = "appApi/queryDeptList";
    // 党建动态
    public static final String queryPartyDynamicPageList = "appApi/queryPartyDynamicPageList";
    // 分页查询学习强局
    public static final String queryStudyStrongBureauPageList = "appApi/queryStudyStrongBureauPageList";
    //  党支部详情
    public static final String queryDeptDetail = "appApi/queryDeptDetail";
    //  查询分组
    public static final String queryDeptGroupList = "appApi/queryDeptGroupList";
    //  根据部门number查询人员信息
    public static final String queryUserListByDeptNumber = "appApi/queryUserListByDeptNumber";
    // 分页查询组织生活信息
    public static final String queryOrganizationalLifePageList = "appApi/queryOrganizationalLifePageList";
    // 党员关系转移详情
    public static final String appApiqueryTransferOrganizationalRelationsDetail ="appApi/queryTransferOrganizationalRelationsDetail";
    // 新增党组织关系转移信息
    public static final String appApiinsertTransferOrganizationalRelations ="appApi/insertTransferOrganizationalRelations";
    // 获取筛选条件（组织生活会主题)
    public static final String apiorglifetopic="api/org/life/topic";
    // 分页查询组织生活
    public static final String apiorglifepage="api/org/life/page";
    // 查看组织生活详情信息
    public static final String apiorglifedetail="api/org/life/detail";
    // 分页查询林区风采信息
    public static final String apistylepage="api/style/page";
    // 林区风采详情信息
    public static final String apistyledetail="api/style/detail";
    // 工匠分页数据
    public static final String apistudycraftsmanpage="api/study/craftsman/page";
    // 工匠详情
    public static final String apistudycraftsmandetail="api/study/craftsman/detail";
    // 学习强局首页
    public static final String apistudyindex="api/study/index";
    // 大讲堂分页数据
    public static final String apistudyopenClasspage="api/study/openClass/page";
    //大讲堂详情
    public static final String apistudyopenClassdetail="api/study/openClass/detail";
    //学习心得保存=>ifPass // 1正式 2草稿
    public static final String apistudystudydetail="api/study/study/detail";
}

