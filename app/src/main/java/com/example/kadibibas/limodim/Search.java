package com.example.kadibibas.limodim;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    //pro
    Button sPro;
    TextView mItemSelected;
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems = new ArrayList<>();

    //class
    Button sClass;
    TextView mItemSelected2;
    String[] listItems2;
    boolean[] checkedItems2;
    ArrayList<Integer> mUserItems2 = new ArrayList<>();

    //city
    Button sCity;
    TextView mItemSelected3;
    String[] listItems3;
    boolean[] checkedItems3;
    ArrayList<Integer> mUserItems3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_search);

        final Button s1 = (Button) findViewById(R.id.sfind);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s = new Intent(Search.this, User.class);
                Search.this.startActivity(s);
            }
        });


        //pro
        sPro = (Button) findViewById(R.id.sPro);
        mItemSelected = (TextView) findViewById(R.id.sproSelected);
        listItems = getResources().getStringArray(R.array.ProItem);
        checkedItems = new boolean[listItems.length];

        //class
        sClass = (Button) findViewById(R.id.sClass);
        mItemSelected2 = (TextView) findViewById(R.id.sclassSelected);
        listItems2 = getResources().getStringArray(R.array.CItem);
        checkedItems2 = new boolean[listItems2.length];

        //city
        sCity = (Button) findViewById(R.id.scity);
        mItemSelected3 = (TextView) findViewById(R.id.scitySelected);
        listItems3 = getResources().getStringArray(R.array.cityItem);
        checkedItems3 = new boolean[listItems3.length];

        //pro
        sPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Search.this);
                mBuilder.setTitle("סמן את מקצוע הלימוד");
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if (isChecked) {
                            if (!mUserItems.contains(position)) {
                                mUserItems.add(position);
                            }
                        } else if (mUserItems.contains(position)) {
                            mUserItems.remove(position);
                        }
                    }
                });
                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("אשר", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems.size(); i++) {
                            item = item + listItems[mUserItems.get(i)];
                            if (i != mUserItems.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        mItemSelected.setText(item);
                    }
                });

                mBuilder.setNegativeButton("בטל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setNeutralButton("נקה הכל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems.length; i++) {
                            checkedItems[i] = false;
                            mUserItems.clear();
                            mItemSelected.setText("לא נבחר מקצוע");
                        }
                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }
        });

        //class
        sClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Search.this);
                mBuilder.setTitle("סמן באיזה כיתה אתה");
                mBuilder.setMultiChoiceItems(listItems2, checkedItems2, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if (isChecked) {
                            if (!mUserItems2.contains(position)) {
                                mUserItems2.add(position);
                            }
                        } else if (mUserItems2.contains(position)) {
                            mUserItems2.remove(position);
                        }

                    }
                });
                mBuilder.setCancelable(false);


                mBuilder.setPositiveButton("אשר", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems2.size(); i++) {
                            item = item + listItems2[mUserItems2.get(i)];
                            if (i != mUserItems2.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        mItemSelected2.setText(item);
                    }
                });

                mBuilder.setNegativeButton("בטל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setNeutralButton("נקה הכל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems2.length; i++) {
                            checkedItems2[i] = false;
                            mUserItems2.clear();
                            mItemSelected2.setText("לא נבחרה כיתה");
                        }
                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }
        });

        //city
        sCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Search.this);
                mBuilder.setTitle("סמן את אזור מגורך");
                mBuilder.setMultiChoiceItems(listItems3, checkedItems3, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if (isChecked) {
                            if (!mUserItems3.contains(position)) {
                                mUserItems3.add(position);
                            }
                        } else if (mUserItems3.contains(position)) {
                            mUserItems3.remove(position);
                        }
                    }
                });
                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("אשר", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems3.size(); i++) {
                            item = item + listItems3[mUserItems3.get(i)];
                            if (i != mUserItems3.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        mItemSelected3.setText(item);
                    }
                });

                mBuilder.setNegativeButton("בטל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });

                mBuilder.setNeutralButton("נקה הכל", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems3.length; i++) {
                            checkedItems3[i] = false;
                            mUserItems3.clear();
                            mItemSelected3.setText("לא נבחר אזור מגורים");
                        }
                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();

            }
        });
    }
}

