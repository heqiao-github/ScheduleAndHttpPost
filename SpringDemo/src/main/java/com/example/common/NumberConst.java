package com.example.common;

public class NumberConst {
    public enum LONG_STATIC {
        LONG_1(1L), LONG_2(2L), LONG_3(3L), LONG_4(4L), LONG_5(5L), LONG_6(6L), LONG_7(7L), LONG_8(8L), LONG_9(9L), LONG_10(10L),
        LONG_11(11L), LONG_12(12L), LONG_16(16L),LONG_18(18L),
        LONG_64(64L),
        LONG_1000(1000L),
        LONG_1288834974657(1288834974657L);
        private long val;

        LONG_STATIC(long val) {
            this.val = val;
        }
        public long getVal() {
            return val;
        }
    }

    public enum INTEGER_STATIC {
        INTEGER_0(0),INTEGER_1(1), INTEGER_2(2), INTEGER_3(3), INTEGER_4(4), INTEGER_5(5), INTEGER_6(6), INTEGER_7(7), INTEGER_8(8), INTEGER_9(9), INTEGER_10(10),
        INTEGER_11(11), INTEGER_12(12), INTEGER_13(13), INTEGER_14(14), INTEGER_15(15), INTEGER_16(16), INTEGER_17(17), INTEGER_18(18), INTEGER_19(19), INTEGER_20(20),
        INTEGER_21(21), INTEGER_22(22), INTEGER_23(23), INTEGER_24(24), INTEGER_25(25), INTEGER_26(26), INTEGER_27(27), INTEGER_28(28), INTEGER_29(29), INTEGER_30(30), INTEGER_31(31), INTEGER_32(32),
        INTEGER_40(40), INTEGER_48(48),
        INTEGER_50(50), INTEGER_57(57), INTEGER_59(59),
        INTEGER_60(60),
        INTEGER_70(70),
        INTEGER_80(80),
        INTEGER_90(90),
        INTEGER_100(100), INTEGER_115(115), INTEGER_186(186),
        INTEGER_200(200),
        INTEGER_360(360),
        INTEGER_500(500),
        INTEGER_501(501),
        INTEGER_555(555),
        INTEGER_600(600),
        INTEGER_800(800),
        INTEGER_1024(1024), INTEGER_4096(4096),
        INTEGER_2027(2027), INTEGER_2028(2028), INTEGER_2521(2521),
        INTEGER_714375(714375),INTEGER_104775(104775),INTEGER_142875(142875), INTEGER_1048576(1048576),
        INTEGER_1000(1000), INTEGER_1500(1500), INTEGER_3000(3000), INTEGER_5000(5000), INTEGER_6000(6000), INTEGER_7000(7000), INTEGER_9990(9990), INTEGER_10000(10000), INTEGER_15000(15000), INTEGER_86400(86400), INTEGER_86400000(86400000);
        private int val;

        INTEGER_STATIC(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    public static final float FLOAT_8 = 8.0f;
    public static final float FLOAT_3 = 3.0f;
    public static final float FLOAT_4 = 4.0f;
    public static final float FLOAT_HALF = 0.5f;
    public static final  double DOUBLE_TINT = -0.14999847407452621d;
    public static final double DOUBLE_66 = 66.0;

}
