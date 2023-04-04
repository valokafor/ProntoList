package com.valokafor.prontolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import timber.log.Timber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: TaskListViewModel = viewModel()
            ProntoList(viewModel){ task ->
                Timber.d("${task.title} checked")
            }
        }
    }
}


