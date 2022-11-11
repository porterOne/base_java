package qqqcloud.cn.forkjoin;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayListUtil {

    /**	 * 去重复元素	 * @param keyExtractor	 * @param <T>	 * @return	 */	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    /**
     * 判断 list 是否包含 targetValue
     * @param list
     * @param targetValue
     * @return
     */
    public static boolean isInclude(List<Student> list, String targetValue){
        return list.contains(targetValue);
    }
}