package com.example.kyungwonyi.stacksalesshop;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    //모든 프레그먼트
    content_main content_main = new content_main();
    shop_info shop_info = new shop_info();
    user_info user_info = new user_info();
    announce_wall announce_wall = new announce_wall();
    qna_wall qna_wall = new qna_wall();
    uploaditem uploaditem = new uploaditem();
    history_wall history_wall = new history_wall();


    Fragment1 fragment1 = new Fragment1();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        setTitle("");


        //첫번째 프래그먼트 생성 (메인화면/제품리스트)
        getSupportFragmentManager().beginTransaction().add(R.id.mainscreen_container, content_main).commit();

        getSupportFragmentManager().beginTransaction().add(R.id.container, fragment1).commit();

        //제품 리스트 탭 리스너 설정
//        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
//
//        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                int position = tab.getPosition();
//
//                //탭 버튼 눌렀을때
//                Fragment selected = null;
//                if (position == 0) {
//                    selected = fragment1;
//                } else if (position == 1) {
//                    selected = fragment2;
//                } else if (position == 2) {
//                    selected = fragment3;
//                } else if (position == 3) {
//                    selected = fragment4;
//                } else if (position == 4) {
//                    selected = fragment5;
//                }
//
//                getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });




        //이메일 문의사항 보내기 버튼
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                Toast toast = Toast.makeText(MainActivity.this,"이메일 문의를 남깁니다", Toast.LENGTH_SHORT);
                toast.show();

                try {
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"StackSalesShop@gmail.com"});

                    emailIntent.setType("text/html");
                    emailIntent.setPackage("com.google.android.gm");
                    if(emailIntent.resolveActivity(getPackageManager())!=null)
                        startActivity(emailIntent);

                    startActivity(emailIntent);
                } catch (Exception e) {
                    e.printStackTrace();

                    emailIntent.setType("text/html");
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT,"스스샵에 문의드립니다.");
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"StackSalesShop@gmail.com"});

                    startActivity(Intent.createChooser(emailIntent, "Send Email"));
                }
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        //메뉴바 설정
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //우측 메뉴 클릭
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, shop_info).commit();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // 네비게이션 뷰 아이템 클릭 설정
        // Handle navigation view item clicks here.

        int id = item.getItemId();

//        ConstraintLayout user_info = (ConstraintLayout)findViewById(R.id.user_info);
//        //ConstraintLayout content_main = (ConstraintLayout)findViewById(R.id.content_main);
//        ConstraintLayout uploaditem = (ConstraintLayout)findViewById(R.id.uploaditem);
//        ConstraintLayout qna_wall = (ConstraintLayout)findViewById(R.id.qna_wall);
//        ConstraintLayout announce_wall = (ConstraintLayout)findViewById(R.id.announce_wall);
//        ConstraintLayout shopinfo = (ConstraintLayout)findViewById(R.id.shop_info);
//        ConstraintLayout write_qna = (ConstraintLayout)findViewById(R.id.write_qna);

        //*********************************************************************************


        if (id == R.id.nav_shoppingList) {
            // 제품 구매하기 메뉴 클릭

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, content_main).commit();

            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();



            Toast toast = Toast.makeText(this,"제품을 구매합니다", Toast.LENGTH_SHORT);
            toast.show();

//            user_info.setVisibility(View.INVISIBLE);
//            // content_main.setVisibility(View.VISIBLE);
//            uploaditem.setVisibility(View.INVISIBLE);
//            qna_wall.setVisibility(View.INVISIBLE);
//            announce_wall.setVisibility(View.INVISIBLE);
//            shopinfo.setVisibility(View.INVISIBLE);
//            write_qna.setVisibility(View.INVISIBLE);


        }

        //*********************************************************************************

        else if (id == R.id.nav_userInfo) {
            // 유저 정보 메뉴 클릭


            Toast toast = Toast.makeText(this,"회원 정보입니다", Toast.LENGTH_SHORT);
            toast.show();

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, user_info).commit();

//            user_info.setVisibility(View.VISIBLE);
//            // content_main.setVisibility(View.INVISIBLE);
//            uploaditem.setVisibility(View.INVISIBLE);
//            qna_wall.setVisibility(View.INVISIBLE);
//            announce_wall.setVisibility(View.INVISIBLE);
//            shopinfo.setVisibility(View.INVISIBLE);
//            write_qna.setVisibility(View.INVISIBLE);




//
//            Button edit1 = (Button) findViewById(R.id.edit1);
//            Button edit2 = (Button) findViewById(R.id.edit2);
//            Button edit3 = (Button) findViewById(R.id.edit3);
//            Button edit4 = (Button) findViewById(R.id.edit4);
//
//            edit1.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View v) {
//                    Toast toast = Toast.makeText(MainActivity.this,"비밀번호가 변경되었습니다", Toast.LENGTH_SHORT);
//                    toast.show();
//
//
//                }
//
//            });
//
//            edit2.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View v) {
//                    Toast toast = Toast.makeText(MainActivity.this,"주소가 변경되었습니다", Toast.LENGTH_SHORT);
//                    toast.show();
//                }
//
//            });
//
//            edit3.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View v) {
//
//                    Toast toast = Toast.makeText(MainActivity.this,"전화번호가 변경되었습니다", Toast.LENGTH_SHORT);
//                    toast.show();
//
//                }
//
//            });
//
//            edit4.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View v) {
//
//                    Toast toast = Toast.makeText(MainActivity.this,"이메일이 변경되었습니다", Toast.LENGTH_SHORT);
//                    toast.show();
//
//                }
//
//            });




        }

        //*********************************************************************************

        else if (id == R.id.nav_tradeHis) {
            // 거래 내역 메뉴 클릭

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, history_wall).commit();
            Toast toast = Toast.makeText(this,"거래내역 확인", Toast.LENGTH_SHORT);
            toast.show();

        }

        //*********************************************************************************


        else if (id == R.id.nav_sellerPro) {
            // 물품 판매 등록 메뉴 클릭

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, uploaditem).commit();

            Toast toast = Toast.makeText(this,"판매자 등급 유저만 접근 가능합니다", Toast.LENGTH_SHORT);
            toast.show();


//            user_info.setVisibility(View.INVISIBLE);
//            // content_main.setVisibility(View.INVISIBLE);
//            uploaditem.setVisibility(View.VISIBLE);
//            qna_wall.setVisibility(View.INVISIBLE);
//            announce_wall.setVisibility(View.INVISIBLE);
//            shopinfo.setVisibility(View.INVISIBLE);
//            write_qna.setVisibility(View.INVISIBLE);

        }



        //*********************************************************************************



        else if (id == R.id.nav_announce) {
            // 공지사항 메뉴 클릭

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, announce_wall).commit();

            Toast toast = Toast.makeText(this,"공지를 확인해보세요", Toast.LENGTH_SHORT);
            toast.show();

//            user_info.setVisibility(View.INVISIBLE);
//            // content_main.setVisibility(View.INVISIBLE);
//            uploaditem.setVisibility(View.INVISIBLE);
//            qna_wall.setVisibility(View.INVISIBLE);
//            announce_wall.setVisibility(View.VISIBLE);
//            shopinfo.setVisibility(View.INVISIBLE);
//            write_qna.setVisibility(View.INVISIBLE);

        }



        //*********************************************************************************


        else if (id == R.id.nav_userFeed) {
            // 유저 게시판 메뉴 클릭

            getSupportFragmentManager().beginTransaction().replace(R.id.mainscreen_container, qna_wall).commit();

            Toast toast = Toast.makeText(this,"자유게시판입니다", Toast.LENGTH_SHORT);
            toast.show();

            Button writewallBtn = (Button) findViewById(R.id.writewallBtn);


//            user_info.setVisibility(View.INVISIBLE);
//            // content_main.setVisibility(View.INVISIBLE);
//            uploaditem.setVisibility(View.INVISIBLE);
//            qna_wall.setVisibility(View.VISIBLE);
//            announce_wall.setVisibility(View.INVISIBLE);
//            shopinfo.setVisibility(View.INVISIBLE);
//            write_qna.setVisibility(View.INVISIBLE);

            writewallBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {


                    ConstraintLayout user_info = (ConstraintLayout)findViewById(R.id.user_info);
                    // ConstraintLayout content_main = (ConstraintLayout)findViewById(R.id.content_main);
                    ConstraintLayout uploaditem = (ConstraintLayout)findViewById(R.id.uploaditem);
                    ConstraintLayout qna_wall = (ConstraintLayout)findViewById(R.id.qna_wall);
                    ConstraintLayout announce_wall = (ConstraintLayout)findViewById(R.id.announce_wall);
                    ConstraintLayout shopinfo = (ConstraintLayout)findViewById(R.id.shop_info);
                    ConstraintLayout write_qna = (ConstraintLayout)findViewById(R.id.write_qna);

                    user_info.setVisibility(View.INVISIBLE);
                    // content_main.setVisibility(View.INVISIBLE);
                    uploaditem.setVisibility(View.INVISIBLE);
                    qna_wall.setVisibility(View.INVISIBLE);
                    announce_wall.setVisibility(View.INVISIBLE);
                    shopinfo.setVisibility(View.INVISIBLE);
                    write_qna.setVisibility(View.VISIBLE);

                }

            });


        }


        //*********************************************************************************



        else if (id == R.id.nav_login_regist) {
            //로그인/회원가입 메뉴 클릭

            Toast toast = Toast.makeText(this,"로그인 창으로 이동합니다", Toast.LENGTH_SHORT);
            toast.show();
            Intent intent = new Intent(this, LoginregistMain.class);
            startActivity(intent);

        }


        //*********************************************************************************

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
