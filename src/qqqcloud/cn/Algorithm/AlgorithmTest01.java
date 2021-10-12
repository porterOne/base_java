package qqqcloud.cn.Algorithm;

import java.util.Arrays;

public class AlgorithmTest01 {

    public static int [][] merge(int [][] intervals) {
        // 行数
        int rows = intervals.length;
        if (rows <= 1) {
            return intervals;
        }
        // 同样大小二维数组用于存放计算结果
        int [][] resultIntervals = new int[rows][2];

        // 上次计算出的结果区间下标
        int resultIntervalsPosition = 0;
        // 添加第一个区间
        resultIntervals[resultIntervalsPosition] = intervals[0];
        /**
         * 1：如果给定区间集合中当前位置区间的左节点数值大于上一次计算出的结果区间的右节点，那么此时必定不存在交集，将该区间放入结果集合中
         * 2：反之，则重新计算结果并更新对应的结果区间（区间右节点取最大值）
         */
        for (int i = 1; i < rows; i++) {
            // 上次结果区间
            int[] currentResultInterval = resultIntervals[resultIntervalsPosition];

            if (intervals[i][0] > currentResultInterval[1]) {
                // 1：如果给定区间集合中当前位置区间的左节点数值大于上一次计算出的结果区间的右节点，那么此时必定不存在交集，将该区间放入结果集合中
                resultIntervalsPosition ++;
                resultIntervals[resultIntervalsPosition] = intervals[i];
            } else {
                // 2：反之，则重新计算结果并更新对应的结果区间（区间右节点取最大值）
                currentResultInterval[1] = Math.max(intervals[i][1], currentResultInterval[1]);
                resultIntervals[resultIntervalsPosition] = currentResultInterval;
            }
        }
        // 删除存在的空值
        return Arrays.copyOf(resultIntervals, resultIntervalsPosition + 1, resultIntervals.getClass());
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {4, 18}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }



}
