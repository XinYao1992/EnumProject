

public class EnumUtil {
    /**
     * Check if value is valid or not
     * @param enums
     * @param value
     * @param <T>
     * @return
     */
    public static <T> boolean isExist(ValueEnum<T>[] enums, T value) {
        if (value == null) {
            return false;
        }
        for (ValueEnum<T> e : enums) {
            if (value.equals(e.getValue())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断枚举值是否存在于指定枚举类中
     * @param enumClass 枚举类
     * @param value     枚举值
     * @param <E>       枚举类型
     * @param <V>       值类型
     * @return true: 存在
     */
    public static <E extends Enum<? extends ValueEnum<V>>, V> boolean isExist(Class<E> enumClass, V value) {
        for (Enum<? extends ValueEnum<V>> e : enumClass.getEnumConstants()) {
            if (((ValueEnum<V>) e).getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 通过value找到枚举名称
     * @param enums 枚举列表
     * @param value 枚举值
     * @param <T>   值类型
     * @return      枚举名称
     */
    public static <T> String getNameByValue(NameValueEnum<T>[] enums, T value) {
        if (value == null) {
            return null;
        }
        for (NameValueEnum<T> e : enums) {
            if (value.equals(e.getValue())) {
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 通过name找到枚举值
     * @param enums 枚举列表
     * @param name  枚举名称
     * @param <T>   枚举值类型
     * @return      枚举值
     */
    public static <T> T getValueByName(NameValueEnum<T>[] enums, String name) {
        if (name == null || name.equals("")) {
            return null;
        }
        for (NameValueEnum<T> e : enums) {
            if (name.equals(e.getName())) {
                return e.getValue();
            }
        }
        return null;
    }

    /**
     * 通过value找到枚举对象
     * @param enums     枚举列表
     * @param value     枚举值
     * @param <E>       枚举类型
     * @param <V>       值类型
     * @return 枚举对象
     */
    public static <E extends Enum<? extends ValueEnum<V>>, V> E getEnumByValue(E[] enums, V value) {
        for (E e : enums) {
            if (value.equals(((ValueEnum<V>) e).getValue())) {
                return e;
            }
        }
        return null;
    }

    /**
     * 通过value找到枚举对象
     * @param enumClass     枚举class
     * @param value         枚举值
     * @param <E>           枚举类型
     * @param <V>           值类型
     * @return 枚举对象
     */
    public static <E extends Enum<? extends ValueEnum<V>>, V> E getEnumByValue(Class<E> enumClass, V value) {
        return getEnumByValue(enumClass.getEnumConstants(), value);
    }
}

















