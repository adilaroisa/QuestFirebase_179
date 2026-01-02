package com.example.pertemuan14firebase.view.route
import com.example.pertemuan14firebase.R


object DestinasiDetail : DestinasiNavigasi{
    override val route = "detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}