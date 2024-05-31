package com.nguyen.compose_bookshelf

data class BookData(val kind: String, val totalItems: Int, val items: List<Item>)

data class Item(
    val kind: String,
    val id: String,
    val etag: String,
    val selfLink: String,
    val volumeInfo: VolumeInfo
)

data class VolumeInfo(
    val title: String,
    val authors: List<String>,
    val publisher: String,
    val publishedDate: String,
    val description: String,
    val industryIdentifiers: List<IndustryIdentifier>,
    val readingModes: ReadingModes,
    val pageCount: Int,
    val printedPageCount: Int,
    val printType: String,
    val categories: List<String>,
    val maturityRating: String,
    val allowAnonLogging: Boolean,
    val contentVersion: String,
    val panelizationSummary: PanelizationSummary,
    val imageLinks: ImageLink?,
    val language: String,
    val previewLink: String,
    val infoLink: String,
    val canonicalVolumeLink: String,
    val layerInfo: LayerInfo,
    val saleInfo: SaleInfo,
    val accessInfo: AccessInfo
)

data class IndustryIdentifier(val type: String, val identifier: String)

data class ReadingModes(val text: Boolean, val imagge: Boolean)

data class PanelizationSummary(val containsEpubBubbles: Boolean, val containsImageBubbles: Boolean)

data class ImageLink(
    val smallThumbnail: String,
    val thumbnail: String,
    val small: String,
    val medium: String
)

data class LayerInfo(val layers: List<Layer>)

data class Layer(val layerId: String, val volumeAnnotationsVersion: String)

data class SaleInfo(val country: String, val saleability: String, val isEbook: Boolean)

data class AccessInfo(
    val country: String,
    val viewability: String,
    val embeddable: Boolean,
    val publicDomain: Boolean,
    val textToSpeechPermission: String,
    val epub: Epub,
    val pdf: Epub,
    val webReaderLink: String,
    val accessViewStatus: String,
    val quoteSharingAllowed: Boolean
)

data class Epub(val isAvailable: Boolean, val acsTokenLink: String)