import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class zqlFirstTest<T>{

    private T[] a =  null;

    public zqlFirstTest(T[] c) {
        this.a = c;
    }

    private T[] getA(){
        return this.a;
    }

    private void setA(T[] b){
        this.a = b;
    }

    public static void main(String args[]){
        System.out.println("first demo!!!");
        System.out.println("hellow");
        HashMap<String,String> mapTemp = new HashMap<String,String>();
        ArrayList<String> lstTemp = new ArrayList<String>();

        zqlFirstTest<Integer> firstObj = new zqlFirstTest<Integer>(new Integer[]{11,22,33});
        Integer[] init = firstObj.getA();
        System.out.print("init start\n");
        System.out.print(Arrays.asList(init)+"\n");
        System.out.print("init end\n");

        Integer[] aTest = new Integer[]{2,1,-1,-2};
        firstObj.setA(aTest);
        firstObj.dualPivotQuickSort();
        System.out.print("aTest="+Arrays.asList(firstObj.getA())+"\n");
        System.out.print("gg="+System.getProperty("sun.boot.class.path")+"\n");

        zqlFirstAssistantContext context1 = zqlFirstAssistantContext.getInstance();
        zqlFirstBothMtrthAssistantFactory firstFactory1 = (zqlFirstBothMtrthAssistantFactory)context1.<Integer>getZqlFirstFactory("1");
        firstFactory1.setTt(new Integer[]{3,3,3});
        zqlFirstAssistantContext context2 = zqlFirstAssistantContext.getInstance();
        zqlFirstBothMtrthAssistantFactory firstFactory2 = (zqlFirstBothMtrthAssistantFactory)context2.<Integer>getZqlFirstFactory("2");
        firstFactory2.setTt(new Integer[]{3,3,4});
        System.out.print("firstFactory1HashCode"+firstFactory1.hashCode()+"\n");
        System.out.print("firstFactory2HashCode"+firstFactory2.hashCode()+"\n");
        if(firstFactory1.equals(new zqlFirstBothMtrthAssistantFactory<Integer>())){
            System.out.print("firstFactory1 is equal to firstFactory2 \n");
        }
        else{
            System.out.print("firstFactory1 is not equal to firstFactory2 \n");
        }
    }

    protected void dualPivotQuickSort(){
        for (Integer i = 0, j = i; i < this.a.length-1; j = ++i) {
            T ai = this.a[i + 1];

            while ((Integer)ai < (Integer)a[j]) {
                a[j + 1] = a[j];
                List<Integer> qq = Arrays.asList((Integer[])this.a);
                System.out.print("qq="+qq.toString()+"\n");
                if (j-- == 0) {
                    break;
                }
            }
            this.a[j + 1] = ai;
            List<Integer> QQ = Arrays.asList((Integer[])this.a);
            System.out.print("QQ="+QQ.toString()+"\n");
        }
    }
}

