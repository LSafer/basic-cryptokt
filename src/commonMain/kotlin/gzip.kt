package net.lsafer.crypto

expect fun ByteArray.gzip(): ByteArray

expect fun String.gzip(): ByteArray

expect fun ByteArray.gunzip(): ByteArray

expect fun ByteArray.gunzipToString(): String
