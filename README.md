##实验二——Android布局实验
*主页面跳转
```MainActivity.java
package com.example.cy5962.layoutdemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linear=(Button) findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener(){
        @Override
            public void onClick(View v){
            Intent i = new Intent();
            i.setClass(com.example.cy5962.layoutdemp.MainActivity.this,com.example.cy5962.layoutdemp.Main2Activity.class);
            startActivity(i);
            }
        });

        Button constaint=(Button) findViewById(R.id.constraint);
        constaint.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent i = new Intent();
                    i.setClass(com.example.cy5962.layoutdemp.MainActivity.this,com.example.cy5962.layoutdemp.Main3Activity.class);
                    startActivity(i);
                }
        });

        Button table=(Button) findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent();
                i.setClass(com.example.cy5962.layoutdemp.MainActivity.this,com.example.cy5962.layoutdemp.Main4Activity.class);
                startActivity(i);
            }
        });

    }

}
```
![仿真机截图](https://img-blog.csdnimg.cn/20190323105740681.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JlbHRv,size_16,color_FFFFFF,t_70)

###项目一：利用线性布局实现
*用属性orientation控制控件的排列方向：vertical表示垂直显示，horizontal表示水平显示
*利用layout_weight属性通过比例调整布局中所有控件大小
*用sharp属性统一设定button的背景颜色和边框颜色
![](https://img-blog.csdnimg.cn/20190319212155997.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JlbHRv,size_16,color_FFFFFF,t_70)
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">


    <!-- 设置填充颜色 -->
    <solid android:color="#222222" />
    <!-- 设置边框颜色 -->
    <stroke android:width="1dp" android:color="#cccccc"/>


</shape>
```

![仿真机截图](https://img-blog.csdnimg.cn/20190319212226391.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JlbHRv,size_16,color_FFFFFF,t_70)
```linearlayout.xml
<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:orientation="vertical"
    android:background="#222222"
    >


    <LinearLayout
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    >
    <Button
        android:id="@+id/oneone"
        android:text="One,One"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/onetwo"
        android:text="One,Two"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1.5"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/onethree"
        android:text="One,Three"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
    <Button
        android:id="@+id/onefour"
        android:text="One,Four"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

</LinearLayout>
<LinearLayout
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    >
    <Button
        android:id="@+id/twoone"
        android:text="Two,One"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/twotwo"
        android:text="Two,Two"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1.5"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/twothree"
        android:text="Two,Three"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/twofour"
        android:text="Two,Four"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

</LinearLayout>
<LinearLayout
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    >
    <Button
        android:id="@+id/threeone"
        android:text="Three,One"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/threetwo"
        android:text="Three,Two"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />

    <Button
        android:id="@+id/threethree"
        android:text="Three,Three"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
    <Button
        android:id="@+id/threefour"
        android:text="Three,Four"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
</LinearLayout>
<LinearLayout
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_weight="1"
    >
    <Button
        android:id="@+id/fourone"
        android:text="Four,One"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
    <Button
        android:id="@+id/fourtwo"
        android:text="Four,Two"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1.5"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
    <Button
        android:id="@+id/fourthree"
        android:text="Four,Three"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
    <Button
        android:id="@+id/fourfour"
        android:text="Four,Four"
        android:textSize="20sp"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:background="@drawable/btn_all_shape"
        android:textColor="#cccccc"
        />
</LinearLayout>

</LinearLayout>
```

###项目二：利用ConstraintLayout实现

```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#111111">

    <TextView
        android:id="@+id/indigo"
        android:layout_width="110dp"
        android:layout_height="75dp"
        android:layout_marginStart="24dp"
        android:layout_marginTop="8dp"
        android:layout_marginBottom="8dp"
        android:background="#9400D3"
        android:gravity="center"
        android:text="INDIGO"
        android:textColor="@color/colorAccent"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textView8"
        app:layout_constraintStart_toEndOf="@+id/blue"
        app:layout_constraintTop_toBottomOf="@+id/orange" />

    <TextView
        android:id="@+id/blue"
        android:layout_width="100dp"
        android:layout_height="77dp"
        android:layout_marginTop="8dp"
        android:layout_marginBottom="8dp"
        android:background="#0000FF"
        android:gravity="center"
        android:text="BLUE"
        android:textColor="@color/colorAccent"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textView8"
        app:layout_constraintEnd_toEndOf="@+id/orange"
        app:layout_constraintStart_toStartOf="@+id/orange"
        app:layout_constraintTop_toBottomOf="@+id/orange" />

    <TextView
        android:id="@+id/yellow"
        android:layout_width="134dp"
        android:layout_height="100dp"
        android:layout_marginEnd="8dp"
        android:background="#FFFF00"
        android:gravity="center"
        android:text="YELLOW"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView5" />

    <TextView
        android:id="@+id/red"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_marginStart="8dp"
        android:background="#FF0000"
        android:gravity="center"
        android:text="RED"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView5" />

    <TextView
        android:id="@+id/orange"
        android:layout_width="132dp"
        android:layout_height="100dp"
        android:background="#FFA500"
        android:gravity="center"
        android:text="ORANGE"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="@+id/textView5"
        app:layout_constraintStart_toStartOf="@+id/textView5"
        app:layout_constraintTop_toBottomOf="@+id/textView5" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="731dp"
        android:layout_height="40dp"
        android:background="#696969"
        android:text="Relative Layout Example"
        android:textAlignment="viewStart"
        android:textColor="@color/colorAccent"
        android:textSize="24sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/green"
        android:layout_width="110dp"
        android:layout_height="75dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="24dp"
        android:layout_marginBottom="8dp"
        android:background="#228B22"
        android:gravity="center"
        android:text="GREEN"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toTopOf="@+id/textView8"
        app:layout_constraintEnd_toStartOf="@+id/blue"
        app:layout_constraintTop_toBottomOf="@+id/orange" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="731dp"
        android:layout_height="77dp"
        android:background="#EE82EE"
        android:gravity="center"
        android:text="VIOLET"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</android.support.constraint.ConstraintLayout>
```
![仿真机截图](https://img-blog.csdnimg.cn/20190319212304409.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JlbHRv,size_16,color_FFFFFF,t_70)

###项目三：利用表格布局实现

```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:stretchColumns="2"
    android:background="#222222">
    <TableLayout>
        <TextView
            android:text="    Open..."
            android:textColor="@color/colorAccent"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableLayout>

    <TableLayout>
        <TextView
            android:text="    Save..."
            android:textColor="@color/colorAccent"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableLayout>

    <TableLayout>
        <TextView
            android:text="    Save As..."
            android:textColor="@color/colorAccent"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableLayout>


    <TableLayout>
        <View
            android:layout_height="4px"
            android:layout_width="match_parent"
            android:background="@color/colorAccent" />
    </TableLayout>

    <TableLayout>
        <TextView
            android:text="X Import..."
            android:textColor="@color/colorAccent"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableLayout>

    <TableLayout>
        <TextView
            android:text="X Export..."
            android:textColor="@color/colorAccent"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableLayout>

    <TableLayout>
        <View
            android:layout_height="4px"
            android:layout_width="match_parent"
            android:background="@color/colorAccent" />
    </TableLayout>

    <TableLayout>
        <TextView
            android:text="    Quit"
            android:textColor="@color/colorAccent"
            android:textSize="18sp"
            android:textStyle="bold" />
    </TableLayout>
</TableLayout>
```
![仿真机截图](https://img-blog.csdnimg.cn/20190319223749614.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JlbHRv,size_16,color_FFFFFF,t_70)

