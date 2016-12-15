package com.example.hillarybriones.todolist;
/**
 * Created by Hillary Briones on 12/14/2016.
 */
/*
public class Task_Adapter extends RecyclerView.Adapter<Task_Adapter.MyViewHolder>  {
    private Task[] mDataset;


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvDesc;
        public MyViewHolder(View v) {
            super(v);

            tvTitle = (TextView) v.findViewById(R.id.txtTitle);
            tvDesc = (TextView) v.findViewById(R.id.txtDesc);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public Task_Adapter(Task[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public Task_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tvTitle.setText(mDataset[position].getTitle());
        holder.tvDesc.setText(mDataset[position].getDesc());
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}*/

