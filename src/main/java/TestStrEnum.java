public enum TestStrEnum implements NameValueEnum<String> {
    T1("String test 1", "01"),
    T2("String test 2", "02");

    private final String name;
    private final String value;

    TestStrEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
