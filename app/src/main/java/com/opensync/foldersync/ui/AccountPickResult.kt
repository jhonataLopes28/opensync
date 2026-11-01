package com.opensync.foldersync.ui

import kotlinx.coroutines.flow.MutableStateFlow

/** Carries a just-created account's id back to whatever screen launched "Adicionar conta". */
object AccountPickResult {
    val lastCreatedId = MutableStateFlow<Long?>(null)
}
