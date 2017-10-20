import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class zqlFirstBothMtrthAssistantFactory<T> extends zqlFirstDefaultAssistantFactory {

    private T[] tt;

    public void setTt(T[] t){
        this.tt = t;
    }

    public T[] getTt(){
        return this.tt;
    }

    public int[] getPhaseManage() {
        return phaseManage;
    }

    private int[] phaseManage = null;

    protected void setPhaseManager(int[] t){
        this.phaseManage = t;
    }

    protected int[] getPhaseManager(){
        return this.phaseManage;
    }

    public void setBusiValidator(int[] t){
        this.phaseManage = t;
    }

    public int[] getBusiValidator(){
        return this.phaseManage;
    }

    @Override
    public int[] getBusiManager(){
        return this.phaseManage;
    }

    @Override
    public int hashCode(){
        int hashCode = 1;
        for(T e:this.tt){
            hashCode = 31 * hashCode + (null == e ? 0 : e.hashCode());
        }
        return  hashCode;
    }

    @Override
    public boolean equals(Object obj){
        //引用判断
        if(!(null == obj ? null == this : false)){
            return false;
        }

        //属性判断
        if(!(obj instanceof zqlFirstBothMtrthAssistantFactory)){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }

        //字段判断
        Object[] ee1 = ((zqlFirstBothMtrthAssistantFactory) obj).getTt();
        T[] ee2 = this.tt;

        //字段引用判断
        if(!(null == ee1 ? null == ee2 : false)){
            return false;
        }

        if (ee1.length!=ee2.length){
            return false;
        }
        for(int i = 0;i<ee1.length;i++){
            if(!(ee1[i]==null?ee2[i]==null:ee1[i].equals(ee2[i]))){
                return false;
            }
        }
        return true;
    }
}
