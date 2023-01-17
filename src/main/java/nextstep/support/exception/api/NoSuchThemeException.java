package nextstep.support.exception.api;

import nextstep.support.exception.ErrorCode;
import nextstep.support.exception.ApiException;

public class NoSuchThemeException extends ApiException {
    @Override
    public ErrorCode getErrorCode() {
        return ErrorCode.NO_SUCH_THEME;
    }
}
