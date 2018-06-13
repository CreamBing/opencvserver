package com.bing.opencv.bean.result;

/**
 * gb 返回的统一code
 */
public enum ResultCode {
    BADREQUEST(400,"错误请求"),
    UNAUTHORIZED(401,"未授权"),
    USERNOTEXIST(402,"用戶不存在"),
    ENJOINFROM(403,"禁止访问"),
    NOTFOUND(404,"未找到"),
    METHODNOTALLOWED(405,"方法禁用"),
	ABNORMALREQUEST(500,"请求异常"),
    DATA_NOT_FOUND(402,"查询不到数据"),
    INVALIDPARAMETER(406,"参数无效"),
	
	/**
	 * http请求返回状态码
	 */
    SUCCESS(200,"成功"),
    CREATED_RESOURCES(201,"已创建"),
    ACCEPTED_REQUEST(202,"已接受请求"),
    UNAUTHORIZED_INFORMATION(203,"非授权信息"),
    NO_CONTENT(204,"无内容"),
    RESET_THE_CONTENT(205,"重置内容"),
    PART_OF_THE_CONTENT(206,"部分内容"),
    MULTIPLE_CHOICE_OPERATION(300,"多种选择"),
    PERMANENT_MOVE(301,"永久移动"),
    TEMPORARY_MOBILE(302,"临时移动"),
    VIEW_OTHER_LOCATIONS(303,"查看其他位置"),
    CONTENT_UNCHANGED(304,"内容未修改"),
    USING_THE_AGENT(305,"使用代理"),
    TEMPORARY_REDIRECTION(307,"临时重定向"),
    BAD_REQUEST(400,"错误请求"),
    UNAUTHORIZED_IDENTITY(401,"未授权"),
    REFUSE_THE_REQUEST(403,"拒绝请求"),
    NO_RESOURCES_FOUND(404,"未找到资源"),
    METHOD_TO_DISABLE(405,"方法禁用"),
    NO_REQUEST(406,"不接受请求"),
    NEED_AGENCY_AUTHORIZATION(407,"需要代理授权"),
    THE_REQUEST_TIMEOUT(408,"请求超时"),
    REQUEST_CONFLICT(409,"请求冲突"),
    REQUEST_RESOURCE_HAS_BEEN_REMOVED(410,"请求资源已删除"),
    EFFECTIVE_LENGTH(411,"需要有效长度"),
    PREMISE_IS_NOT_SATISFIED(412,"未满足前提条件"),
    EXCESSIVE_REQUEST_ENTITY(413,"请求实体过大"),
    REQUESTED_URI_IS_TOO_LONG(414,"请求的 URI 过长"),
    UNSUPPORTED_MEDIA_TYPES(415,"不支持的媒体类型"),
    REQUEST_SCOPE_DOES_NOT_MEET(416,"请求范围不符合要求"),
    UNMET_EXPECTATION(417,"未满足期望值"),
    DUPLICATE_REGISTER(418,"重复注册"),
    SERVER_INTERNAL_ERROR(500,"服务器内部错误"),
    NOT_YET_IMPLEMENTED(501,"尚未实施"),
    BAD_GATEWAY(502,"错误网关"),
    SERVICE_UNAVAILABLE(503,"服务不可用"),
    GATEWAY_TIMEOUT(504,"网关超时"),
    HTTP_VERSION_IS_NOT_SUPPORTED(505,"HTTP版本不受支持");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
