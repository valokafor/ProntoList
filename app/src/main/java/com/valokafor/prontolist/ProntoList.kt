package com.valokafor.prontolist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProntoList(viewModel: TaskListViewModel, clickOnIsCompleted: (TaskModel) -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.headlineSmall
                    )
                }
            )
        },
        containerColor = MaterialTheme.colorScheme.background
    ) {innerPadding ->
        Column() {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = innerPadding
            ) {
                itemsIndexed(viewModel.sampleTasks) { index, item ->
                    TaskCard(item, index) {position ->
                        viewModel.onTaskChecked(position)
                    }
                }
            }
        }
    }
}