package com.xiguzai.shardingsphere.jdbc.algorithm;

public class HalfYearShardingAlgorithm extends MonthShardingAlgorithm {

    private static final int MONTH_STEP = 6;

    @Override
    protected String getRouteTableNo(int month) {
        int monthStep = getMonthStep();
        int i = month / (monthStep + 1) + 1;
        return String.valueOf(i);
    }

    @Override
    public int getMonthStep() {
        return MONTH_STEP;
    }
}
