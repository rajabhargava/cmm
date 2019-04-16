package com.example.cmm;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SubjectAddapter extends ArrayAdapter<SubjectModel> implements View.OnClickListener {

    private ArrayList<SubjectModel> subModel;
    Context mContext;

    private static class ViewHolder {
        ImageView imageView;
        TextView textView;
        SeekBar progressBar;
        TextView tv;
    }

    public SubjectAddapter(ArrayList<SubjectModel> subModel, Context context) {
        super(context, R.layout.subject, subModel);
        this.subModel = subModel;
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {

        int pos = (Integer) v.getTag();
        Object obj = getItem(pos);
        SubjectModel subModel = (SubjectModel) obj;

        switch (v.getId()) {
            case R.id.rl_sub:
                Snackbar.make(v, "Clicked", Snackbar.LENGTH_SHORT).setAction("No action", null).show();
                break;
        }
    }
    private int lastpos = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SubjectModel subjectModel = getItem(position);
        ViewHolder viewHolder;
        final View res;

        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.subject,parent,false);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv_sub);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.tv_subname);
            viewHolder.progressBar = (SeekBar) convertView.findViewById(R.id.pv_sub);
            viewHolder.tv = (TextView) convertView.findViewById(R.id.tv_prog_percent);

            res = convertView;

            convertView.setTag(viewHolder);

        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
            res = convertView;
        }

        viewHolder.imageView.setImageResource(subjectModel.getImg());
        viewHolder.textView.setText(subjectModel.getName());
        viewHolder.progressBar.setProgress(subjectModel.prog);
        viewHolder.tv.setText(String.valueOf(subjectModel.getProg()));

        return convertView;
    }
}


