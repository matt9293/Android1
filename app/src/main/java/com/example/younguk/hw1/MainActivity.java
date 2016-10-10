package com.example.younguk.hw1;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.SimpleAdapter;
        import android.widget.TextView;

        import java.util.ArrayList;
        import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    String[] review = {"짜장면은 맛있다.", "짬뽕도 맛있다.", "우동도 맛있다.",
            "볶음밥도 맛있다.", "깐풍기도 맛있다.", "쟁반짜장도 맛있다.",
            "간짜장도 맛있다.", "탕수육도 맛있다.", "군만두도 맛있다.",
            "짬짜면도 맛있다.", "탕짜면도 맛있다.", "고추잡채도 맛있다."};// 사진 밑에 들어갈 리뷰 배열
    int[] images = {R.drawable.menu1, R.drawable.menu2, R.drawable.menu3,
            R.drawable.menu4, R.drawable.menu5, R.drawable.menu6,
            R.drawable.menu7, R.drawable.menu8, R.drawable.menu9,
            R.drawable.menu10, R.drawable.menu11, R.drawable.menu12}; // ImageView에 들어갈 사진 배열

    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
    HashMap<String, String> item;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listView);

        item = new HashMap<String, String>(); //simple_item_list2에 들어갈 리스트 생성
        item.put("Tag01", "짜장면");
        item.put("Tag02", "5000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "짬뽕");
        item.put("Tag02", "6000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "우동");
        item.put("Tag02", "7000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "볶음밥");
        item.put("Tag02", "8000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "깐풍기");
        item.put("Tag02", "9000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "쟁반짜장");
        item.put("Tag02", "10000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "간짜장");
        item.put("Tag02", "11000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "탕수육");
        item.put("Tag02", "12000원");
        list.add(item);


        item = new HashMap<String, String>();
        item.put("Tag01", "군만두");
        item.put("Tag02", "13000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "짬짜면");
        item.put("Tag02", "14000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "탕짜면");
        item.put("Tag02", "15000원");
        list.add(item);

        item = new HashMap<String, String>();
        item.put("Tag01", "고추잡채");
        item.put("Tag02", "16000원");
        list.add(item);



        SimpleAdapter adapter = new SimpleAdapter(this, list, android.R.layout.simple_list_item_2,
                new String[]{"Tag01", "Tag02"}, new int[]{android.R.id.text1, android.R.id.text2,});
        listView.setAdapter(adapter); //adapter 적용

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView)findViewById(R.id.textView2);
                ImageView imageView = (ImageView)findViewById(R.id.image);
                textView.setText(review[position]); //클릭 할 때 리뷰
                imageView.setImageResource(images[position]); //클릭 할 때 이미지
            }
        });
    }
}
