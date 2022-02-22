import org.junit.Assert;
import org.junit.Test;

public class TestEnum {
    @Test
    public void isExist() {
        Assert.assertTrue(EnumUtil.isExist(TestStrEnum.values(), "01"));
        Assert.assertTrue(EnumUtil.isExist(TestStrEnum.values(), "02"));
        Assert.assertTrue(EnumUtil.isExist(TestIntEnum.values(), 1));
        Assert.assertTrue(EnumUtil.isExist(TestIntEnum.values(), 2));
    }

    @Test
    public void getNameByValue() {
        String name1 = EnumUtil.getNameByValue(TestStrEnum.values(), "01");
        String name2 = EnumUtil.getNameByValue(TestStrEnum.values(), "02");
        String name3 = EnumUtil.getNameByValue(TestIntEnum.values(), 1);
        String name4 = EnumUtil.getNameByValue(TestIntEnum.values(), 2);
        Assert.assertEquals("String test 1", name1);
        Assert.assertEquals("String test 2", name2);
        Assert.assertEquals("Integer test 1", name3);
        Assert.assertEquals("Integer test 2", name4);
    }

    @Test
    public void getValueByName() {
        String value1 = EnumUtil.getValueByName(TestStrEnum.values(), "String test 1");
        String value2 = EnumUtil.getValueByName(TestStrEnum.values(), "String test 2");
        int value3 = EnumUtil.getValueByName(TestIntEnum.values(), "Integer test 1");
        int value4 = EnumUtil.getValueByName(TestIntEnum.values(), "Integer test 2");
        Assert.assertEquals("01", value1);
        Assert.assertEquals("02", value2);
        Assert.assertEquals(1, value3);
        Assert.assertEquals(2, value4);
    }

    @Test
    public void getEnumByValue() {
        TestStrEnum strEnum = EnumUtil.getEnumByValue(TestStrEnum.class, "01");
        Assert.assertEquals("String test 1", strEnum.getName());
        TestIntEnum intEnum = EnumUtil.getEnumByValue(TestIntEnum.values(), 1);
        Assert.assertEquals("Integer test 1", intEnum.getName());
    }
}
