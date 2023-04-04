package com.valokafor.prontolist

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.outlined.Alarm
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.valokafor.prontolist.ui.theme.ProntoTodoTheme

@Composable
fun TaskCard(task: TaskModel, position: Int, onCompleteCheckClicked: (Int) -> Unit) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .wrapContentHeight()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Max)
        ) {
            Spacer(
                modifier = Modifier
                    .width(5.dp)
                    .fillMaxHeight()
                    .background(task.priority.color)
            )
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .toggleable(
                            value = task.isCompleted,
                            onValueChange = { onCompleteCheckClicked(position) },
                            role = Role.Checkbox
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = task.title,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.weight(1f))
                    Checkbox(
                        checked = task.isCompleted,
                        onCheckedChange = null,
                        colors = CheckboxDefaults.colors(
                            checkedColor = MaterialTheme.colorScheme.tertiary,
                            uncheckedColor = MaterialTheme.colorScheme.onSurfaceVariant,
                            checkmarkColor = MaterialTheme.colorScheme.surface
                        ),
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        imageVector = Icons.Default.CalendarMonth,
                        contentDescription = "Calender icon",
                        tint = if (task.isOutDate()) {
                            MaterialTheme.colorScheme.error
                        } else {
                            MaterialTheme.colorScheme.onSurfaceVariant
                        }
                    )

                    Text(
                        text = task.getTaskDate(),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )

                    Spacer(
                        modifier = Modifier
                            .height(16.dp)
                            .width(1.dp)
                            .background(MaterialTheme.colorScheme.outline)
                    )

                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_access_time_24),
                        contentDescription = "Calender icon",
                        tint = if (task.isOutDate()) {
                            MaterialTheme.colorScheme.error
                        } else {
                            MaterialTheme.colorScheme.onSurfaceVariant
                        },
                        modifier = Modifier.padding(start = 8.dp)
                    )

                    Text(
                        text = task.getTaskTime(),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                if (task.hasReminder) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .background(
                                color = MaterialTheme.colorScheme.secondaryContainer,
                                shape = RoundedCornerShape(16.dp)
                            )
                    ) {
                        Text(
                            text = stringResource(id = R.string.reminder_on),
                            color = MaterialTheme.colorScheme.tertiary,
                            modifier = Modifier.padding(vertical = 2.dp, horizontal = 6.dp)
                        )

                        Icon(
                            imageVector = Icons.Outlined.Alarm,
                            contentDescription = "Alarm icon",
                            tint = MaterialTheme.colorScheme.tertiary,
                            modifier = Modifier.padding(vertical = 2.dp, horizontal = 6.dp)
                        )
                    }
                }


            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TaskCardPreview() {
//   ProntoTodoTheme {
//       TaskCard(task = SampleData.getSampleTasks()[0]) {
//
//       }
//   }
//}