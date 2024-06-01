package com.nguyen.compose_bookshelf

data class BookData(val kind: String, val totalItems: Int, val items: List<Item>)

data class Item(
    val kind: String? = null,
    val id: String? = null,
    val etag: String? = null,
    val selfLink: String? = null,
    val volumeInfo: VolumeInfo? = null,
    val saleInfo: SaleInfo? = null,
    val accessInfo: AccessInfo? = null,
    val searchInfo: SearchInfo? = null
)

data class VolumeInfo(
    val title: String? = null,
    val authors: List<String>? = null,
    val publisher: String? = null,
    val publishedDate: String? = null,
    val description: String? = null,
    val industryIdentifiers: List<IndustryIdentifier>? = null,
    val readingModes: ReadingModes? = null,
    val pageCount: Int? = null,
    val printedPageCount: Int? = null,
    val printType: String? = null,
    val categories: List<String>? = null,
    val averageRating: Int? = null,
    val ratingsCount: Int? = null,
    val maturityRating: String? = null,
    val allowAnonLogging: Boolean? = null,
    val contentVersion: String? = null,
    val panelizationSummary: PanelizationSummary? = null,
    val imageLinks: ImageLink? = null,
    val language: String? = null,
    val previewLink: String? = null,
    val infoLink: String? = null,
    val canonicalVolumeLink: String? = null,
    val layerInfo: LayerInfo? = null,
    val saleInfo: SaleInfo? = null,
    val accessInfo: AccessInfo? = null
)

data class IndustryIdentifier(val type: String? = null, val identifier: String? = null)

data class ReadingModes(val text: Boolean? = null, val imagge: Boolean? = null)

data class PanelizationSummary(val containsEpubBubbles: Boolean? = null, val containsImageBubbles: Boolean? = null)

data class ImageLink(
    val smallThumbnail: String? = null,
    val thumbnail: String? = null,
    val small: String? = null,
    val medium: String? = null
)

data class LayerInfo(val layers: List<Layer>? = null)

data class Layer(val layerId: String? = null, val volumeAnnotationsVersion: String? = null)

data class SaleInfo(val country: String? = null, val saleability: String? = null, val isEbook: Boolean? = null)

data class AccessInfo(
    val country: String? = null,
    val viewability: String? = null,
    val embeddable: Boolean? = null,
    val publicDomain: Boolean? = null,
    val textToSpeechPermission: String? = null,
    val epub: Epub? = null,
    val pdf: Pdf? = null,
    val webReaderLink: String? = null,
    val accessViewStatus: String? = null,
    val quoteSharingAllowed: Boolean? = null
)

data class Epub(val isAvailable: Boolean? = null)

data class Pdf(val isAvailable: Boolean? = null, val acsTokenLink: String? = null)

data class SearchInfo(val textSnippet: String? = null)