package com.example.kyungwonyi.stacksalesshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class announce_wall extends Fragment {



    announce_listview announce_listview = new announce_listview();


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup announce_wall, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.announce_wall, announce_wall, false);

        getFragmentManager().beginTransaction().replace(R.id.announce_content, announce_listview).commit();

        ListView _dynamic1 = (ListView) rootView.findViewById(R.id._dynamic1);



//        AnnounceAdapter adapter = new AnnounceAdapter();
//        _dynamic1.setAdapter(new AnnounceAdapter());
//
//        adapter.addItem(new annouceitem("중요공지입니다","2018년 8월 9일"));
//        adapter.addItem(new annouceitem("서비스 점검 안내입니","2018년 8월 9일"));
//        adapter.addItem(new annouceitem("보안 공지","2018년 8월 9일"));
//        adapter.addItem(new annouceitem("계좌입금 공지","2018년 12월 9일"));
//        adapter.addItem(new annouceitem("휴일 공지","2018년 10월 9일"));
//        adapter.addItem(new annouceitem("중요공지입니다","2018년 8월 9일"));
//
//


    return rootView;

    }

//    class AnnounceAdapter extends BaseAdapter {
//        ArrayList<annouceitem> items = new ArrayList<annouceitem>();
//
//        @Override
//        public int getCount() {
//            return items.size();
//        }
//
//        public void addItem(annouceitem item) {
//            items.add(item);
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return items.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            announceitemView view = new announceitemView(getContext());
//
//            annouceitem item = items.get(position);
//            view.setTitle(item.getTitle());
//            view.setContent(item.getContent());
//
//
//
//            return null;
//        }
//    }

}
