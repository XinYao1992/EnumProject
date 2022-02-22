/**
 * @author Xin Yao
 * @date Feb 17 2022
 */
public interface NameValueEnum<T> extends ValueEnum<T> {
    /**
     * Get the name of enum
     * @return enum's name
     */
    String getName();
}
