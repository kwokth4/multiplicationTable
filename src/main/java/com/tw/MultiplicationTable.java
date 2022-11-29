package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end)?generateTable(start, end):null;
    }

    public Boolean isValid(int start, int end) {
        return isStartNotBiggerThanEnd(start, end) && isInRange(start) && isInRange(end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String result="";
        for(int index = start; index<=end; index++){
            result += generateLine(start,index);
            if(index < end){
                result+=System.lineSeparator();
            }
        }
        return result;
    }

    public String generateLine(int start, int row) {
        String result="";
        for(int index = start; index<=row; index++){
            result += generateSingleExpression(index,row)+"  ";
        }
        return result.substring(0,result.length()-2);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand+"*"+multiplier+"="+(multiplicand*multiplier);
    }
}
