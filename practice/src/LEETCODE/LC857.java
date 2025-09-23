//package LEETCODE;
//
//public class LC857 {
//    public static void main(String[] args) {
//
//    }
//
//    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
//
//        double [] perDayWage = new double[quality.length];
//
//        for (int i = 0; i < quality.length; i++) {
//            perDayWage[i] = 1.0 * wage[i] / quality[i];
//        }
//
//        for (int i = 0; i < quality.length; i++) {
//            for (int j = i; j < quality.length; j++) {
//                double salarySum = salarySum (perDayWage[i], perDayWage[j]);
//            }
//
//        }
//    }
//
//    private double salarySum (int wage1, int wage2){
//
//    }
//}
