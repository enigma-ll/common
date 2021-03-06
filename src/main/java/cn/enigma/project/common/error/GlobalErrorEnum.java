package cn.enigma.project.common.error;

/**
 * @author luzh
 * Create: 2019-05-28 16:33
 * Modified By:
 * Description:
 */
public enum GlobalErrorEnum implements SystemError {
    DEFAULT_ERROR("1", "系统异常"),
    REQUEST_PARAM_ERROR("P10001", "请求参数错误"),
    DATA_BOT_FOUNT_ERROR("D10001", "数据不存在")
    ;

    GlobalErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    @Override
    public String errorCode() {
        return code;
    }

    @Override
    public String errorMessage() {
        return message;
    }
}
