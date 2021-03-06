package lz.com.tools.recycleview.checked;

import android.util.ArrayMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;


public abstract class CheckHelper<T extends Object> {
    protected ArrayMap<T, RecyclerView.ViewHolder> checkedList = new ArrayMap<>();

    protected OnCheckedListener mOnCheckedListener;

    public abstract void onSelect(RecyclerView.ViewHolder holder, T obj, int position);

    public abstract void isChecked(RecyclerView.ViewHolder holder, T obj, int position);


    public CheckHelper<T> setOnCheckedListener(OnCheckedListener onCheckedListener) {
        mOnCheckedListener = onCheckedListener;
        return this;
    }

    public interface OnCheckedListener<D, V extends RecyclerView.ViewHolder> {
        void onChecked(V holder, D obj, boolean isChecked);

    }

    public ArrayList<T> getCheckedList() {
        return new ArrayList<>(checkedList.keySet());
    }

    public CheckHelper setSingleDefaultItem(T obj) {
        return this;
    }

    public CheckHelper<T> setLastItemEnable(boolean canCancel) {
        return this;
    }


    public CheckHelper setMultiDefaultItem(T... obj) {
        return this;
    }

    public void setMultiDefaultItem(List<T> objs) {
    }

    public CheckHelper setAlwaysSelectItem(T... unCancelItem) {
        return this;
    }

}