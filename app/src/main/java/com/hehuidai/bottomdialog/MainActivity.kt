package com.hehuidai.bottomdialog

import android.app.Dialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_showdailog.setOnClickListener{
            val bottomDialogView = View.inflate(this@MainActivity,R.layout.dialog_bottom,null)
            val bottomDialog = Dialog(this@MainActivity, R.style.dialog_bottom_full)
            bottomDialog.setCanceledOnTouchOutside(true)//点击窗体外部可以关闭弹窗
            bottomDialog.setCancelable(true)
            val window = bottomDialog.window
            window.setGravity(Gravity.BOTTOM)
            window.setWindowAnimations(R.style.share_animation)
            window.setContentView(bottomDialogView)
            window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)//设置横向全屏
            bottomDialog.show()
        }
    }
}
