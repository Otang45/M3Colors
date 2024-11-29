package otang.app.m3colors.utils

import android.content.Intent

fun createNewDocumentIntent(): Intent {
    val intent = Intent(Intent.ACTION_OPEN_DOCUMENT_TREE)
    intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
    intent.setFlags(Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION)
    intent.setFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
    return intent
}