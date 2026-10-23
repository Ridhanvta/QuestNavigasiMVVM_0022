package com.example.pertemuan6.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(R.string.alamat), "Yogyakarta")
    )
}