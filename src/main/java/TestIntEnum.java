public enum TestIntEnum implements NameValueEnum<Integer> {
    T1("Integer test 1", 1),
    T2("Integer test 2", 2);

    private final String name;
    private final Integer value;

    TestIntEnum(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }
}
