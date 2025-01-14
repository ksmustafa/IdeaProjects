package model.enumeratation;
public enum CharSet {

    CHAR_0(0, "S"),
    CHAR_1(1, "I"),
    CHAR_2(2, "Ç"),
    CHAR_3(3, "M"),
    CHAR_4(4, "I"),
    CHAR_5(5, "K");

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    private final Integer code;
    private final String value;

    CharSet(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public static String getValue(Integer code) {
        for (CharSet charSet : values()) {
            if (charSet.getCode().equals(code)) {
                return charSet.getValue();
            }
        }
        return null;
    }
}
