package com.taskassist;



        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.Toast;


public class StaffMain extends AppCompatActivity  {
    String floor,roomtype, roomno, issue;
    Spinner floorSpinner,issueSpinner, roomnoSpinner ,roomtypeSpinner ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staffmain);



//Spinners:
        floorSpinner = (Spinner)findViewById(R.id.floorspinner);
        roomtypeSpinner = (Spinner) findViewById(R.id.roomtypespinner);
        roomnoSpinner = (Spinner) findViewById(R.id.roomnospinner);

        issueSpinner = (Spinner) findViewById(R.id.issuespinner);

        ArrayAdapter <String> floorAdapter =new ArrayAdapter<String>(StaffMain.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.floors));

        floorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        floorSpinner.setAdapter(floorAdapter);







        //FloorSpinner on select:

        floorSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {






            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                // reset other spinners
                roomtypeSpinner.setSelection(0);
                roomnoSpinner.setSelection(0);
                issueSpinner.setSelection(0);
                roomno=null;
                roomtype=null;
                issue=null;

                if(i==0){
                    floor=null;
                }


                if(i==1){
                    floor="4";


                    ArrayAdapter<String> roomtypeAdapter = new ArrayAdapter<String>(StaffMain.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.forth_f_rooms));

                    roomtypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    roomtypeSpinner.setAdapter(roomtypeAdapter);

                    roomtypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                            if(i==1)
                            {

                                roomtype="classroom";

                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.forth_floor_class));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override

                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }

                                        roomno = adapterView.getItemAtPosition(i).toString();

                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.class_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }

                    });
                }


                else if(i==2){
                    floor="5";


                    ArrayAdapter<String> roomtypeAdapter = new ArrayAdapter<String>(StaffMain.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.fifth_f_rooms));

                    roomtypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    roomtypeSpinner.setAdapter(roomtypeAdapter);

                    roomtypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                            if(i==1)
                            {    roomtype="classroom";


                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.fifth_floor_class));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);

                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.class_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if(i==3){
                    floor="6";



                    ArrayAdapter<String> roomtypeAdapter = new ArrayAdapter<String>(StaffMain.this,
                            android.R.layout.simple_list_item_1,

                            // *******FOR STUDENT: use string array: stu_sixth_f_rooms................
                            getResources().getStringArray(R.array.sixth_f_rooms));

                    roomtypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    roomtypeSpinner.setAdapter(roomtypeAdapter);

                    roomtypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                            if(i==1)
                            {   roomtype="classroom";


                                ArrayAdapter<String> roomnoAdapter= new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.sixth_floor_class));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.class_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            else if(i==2)
                            {   roomtype="lab";


                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.sixth_floor_labs));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.lab_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            else
                            if(i==3)
                            {
                                //Copy code from below if(i==4)..................................
                                roomtype="faculty";


                                ArrayAdapter<String> roomnoAdapter= new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.sixth_floor_faculty));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                                /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.faculty_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }

                            // copy till here...................................................


                            else


//This is not included in student....................................................
                                if(i==4)
                                { roomtype="washroom";


                                    ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                            android.R.layout.simple_list_item_1,
                                            getResources().getStringArray(R.array.washroom_num));

                                    roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                    roomnoSpinner.setAdapter(roomnoAdapter);
                                    roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                            if(i==0){
                                                roomno=null;
                                            }
                                            roomno = adapterView.getItemAtPosition(i).toString();
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> adapterView) {

                                        }
                                    });

                /* issue spinner */


                                    ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                            android.R.layout.simple_list_item_1,
                                            getResources().getStringArray(R.array.washroom_issues));

                                    issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                    issueSpinner.setAdapter(issueAdapter);
                                    issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                        @Override
                                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                            issue = adapterView.getItemAtPosition(i).toString();
                                            if(i==0){
                                                issue=null;
                                            }
                                        }

                                        @Override
                                        public void onNothingSelected(AdapterView<?> adapterView) {

                                        }
                                    });
                                }
                            //NOT INCLUDED IN STUDENT,,,COPY TILL HERE...............................................................................
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if(i==4){

                    floor="7";


                    ArrayAdapter<String> roomtypeAdapter = new ArrayAdapter<String>(StaffMain.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.seventh_f_rooms));

                    roomtypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    roomtypeSpinner.setAdapter(roomtypeAdapter);

                    roomtypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                            if(i==1)
                            {  roomtype="classroom";
                                Spinner roomnoSpinner = (Spinner) findViewById(R.id.roomnospinner);

                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.seventh_floor_class));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.class_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            else

                            if(i==2)
                            {  roomtype="lab";


                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.seventh_floor_labs));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.lab_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if(i==5){

                    floor="8";


                    ArrayAdapter<String> roomtypeAdapter = new ArrayAdapter<String>(StaffMain.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.eight_f_rooms));

                    roomtypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    roomtypeSpinner.setAdapter(roomtypeAdapter);
                    roomtypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                            if(i==1)
                            { roomtype="classroom";
                                Spinner roomnoSpinner = (Spinner) findViewById(R.id.roomnospinner);

                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.eighth_floor_class));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.class_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            else
                            if(i==2)
                            { roomtype="lab";


                                ArrayAdapter<String> roomnoAdapter= new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.eighth_floor_labs));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.lab_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            else

                            if(i==3)
                            { roomtype="washroom";


                                ArrayAdapter<String> roomnoAdapter= new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.washroom_num));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.washroom_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if(i==6){

                    floor="9";


                    ArrayAdapter<String> roomtypeAdapter = new ArrayAdapter<String>(StaffMain.this,
                            android.R.layout.simple_list_item_1,
                            getResources().getStringArray(R.array.ninth_f_rooms));

                    roomtypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                    roomtypeSpinner.setAdapter(roomtypeAdapter);
                    roomtypeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                            if(i==1)
                            { roomtype="classroom";


                                ArrayAdapter<String> roomnoAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.ninth_floor_class));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.class_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                            else
                            if(i==2)
                            { roomtype="lab";


                                ArrayAdapter<String> roomnoAdapter= new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.ninth_floor_labs));

                                roomnoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                roomnoSpinner.setAdapter(roomnoAdapter);
                                roomnoSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        if(i==0){
                                            roomno=null;
                                        }
                                        roomno = adapterView.getItemAtPosition(i).toString();
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });

                                            /* issue spinner */


                                ArrayAdapter<String> issueAdapter = new ArrayAdapter<String>(StaffMain.this,
                                        android.R.layout.simple_list_item_1,
                                        getResources().getStringArray(R.array.lab_issues));

                                issueAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                                issueSpinner.setAdapter(issueAdapter);
                                issueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                        issue = adapterView.getItemAtPosition(i).toString();
                                        if(i==0){
                                            issue=null;
                                        }
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> adapterView) {

                                    }
                                });
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });



        //button

        Button btn= (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(floor==null  || roomno==null  || roomtype==null  || issue==null  )
                {
                    Toast.makeText(StaffMain.this, "Enter data correctly and fill each field.", Toast.LENGTH_SHORT).show();
                }
                else {


                    AlertDialog.Builder altdial = new AlertDialog.Builder(StaffMain.this);

                    altdial.setMessage("Are you sure of your selections: "+ "\n" + "\n" + "Floor number:" + floor + "\n" + "Room Type:" + roomtype + "\n" + "Room number:" + roomno + "\n" + "Issue:" + issue + "\n").
                            setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {


                            String data=" Floor Number:" + floor+ "\n" + " Room Type:" + roomtype+ "\n" +" Room Number:" +  roomno+ "\n"+ " Issue:" + issue ;




                            Shared sh=new Shared(StaffMain.this);



                            int id = sh.getID("ID");
                            String key = "msg"+id;


                            sh.setPreference(StaffMain.this,key,data);
                            String key1="issue"+id;
                            sh.setPreference(StaffMain.this,key1,issue);

                            id++;
                            sh.setID(StaffMain.this,"ID",id);



                           // TextView txt = (TextView) findViewById(R.id.textView2);

                            //txt.setText(key);




                            Toast.makeText(StaffMain.this, "Query submitted!", Toast.LENGTH_SHORT).show();

                          Intent intent = new Intent(StaffMain.this, StaffHome.class);
                          startActivity(intent);


                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {


                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();

                        }
                    });
                    AlertDialog alert = altdial.create();
                    alert.getWindow().setBackgroundDrawableResource(R.drawable.alert);
                    alert.show();

                }

            }
        });

    }
}

