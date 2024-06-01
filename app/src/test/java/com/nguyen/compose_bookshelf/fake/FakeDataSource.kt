package com.nguyen.compose_bookshelf.fake

import com.nguyen.compose_bookshelf.AccessInfo
import com.nguyen.compose_bookshelf.BookData
import com.nguyen.compose_bookshelf.Epub
import com.nguyen.compose_bookshelf.ImageLink
import com.nguyen.compose_bookshelf.IndustryIdentifier
import com.nguyen.compose_bookshelf.Book
import com.nguyen.compose_bookshelf.PanelizationSummary
import com.nguyen.compose_bookshelf.Pdf
import com.nguyen.compose_bookshelf.ReadingModes
import com.nguyen.compose_bookshelf.SaleInfo
import com.nguyen.compose_bookshelf.SearchInfo
import com.nguyen.compose_bookshelf.VolumeInfo

object FakeDataSource {
    private val book1 = Book(
        kind = "books#volume",
        id = "NRWlitmahXkC",
        etag = "V4Scri+pIps",
        selfLink = "https://www.googleapis.com/books/v1/volumes/NRWlitmahXkC",
        volumeInfo = VolumeInfo(
            title = "Flowers for Algernon",
            authors = listOf("Daniel Keyes"),
            publisher = "Houghton Mifflin Harcourt",
            publishedDate = "2005-05",
            description = "Mentally retarded Charlie Gordon participates in an experiment which turns him into a genius, but only temporarily.",
            industryIdentifiers = listOf(
                IndustryIdentifier(type = "ISBN_10", identifier = "0156030306"),
                IndustryIdentifier(type = "ISBN_13", identifier = "9780156030304")
            ),
            readingModes = ReadingModes(text = false, imagge = true),
            pageCount = 328,
            printType = "BOOK",
            categories = listOf("Fiction"),
            averageRating = 4,
            ratingsCount = 50,
            maturityRating = "NOT_MATURE",
            allowAnonLogging = true,
            contentVersion = "0.4.8.0.preview.1",
            panelizationSummary = PanelizationSummary(containsEpubBubbles = false, containsImageBubbles = false),
            imageLinks = ImageLink(
                smallThumbnail = "http://books.google.com/books/content?id=NRWlitmahXkC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
                thumbnail = "http://books.google.com/books/content?id=NRWlitmahXkC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
            ),
            language = "en",
            previewLink = "http://books.google.com/books?id=NRWlitmahXkC&printsec=frontcover&dq=flowers+inauthor:keyes&hl=&cd=1&source=gbs_api",
            infoLink = "http://books.google.com/books?id=NRWlitmahXkC&dq=flowers+inauthor:keyes&hl=&source=gbs_api",
            canonicalVolumeLink = "https://books.google.com/books/about/Flowers_for_Algernon.html?hl=&id=NRWlitmahXkC",
        ),
        saleInfo = SaleInfo(country = "US", saleability = "NOT_FOR_SALE", isEbook = false),
        accessInfo = AccessInfo(
            country = "US",
            viewability = "PARTIAL",
            embeddable = true,
            publicDomain = false,
            textToSpeechPermission = "ALLOWED",
            epub = Epub(isAvailable = false),
            pdf = Pdf(
                isAvailable = true,
                acsTokenLink = "http://books.google.com/books/download/Flowers_for_Algernon-sample-pdf.acsm?id=F1wgqlNi8AMC&format=pdf&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
            ),
            webReaderLink = "http://play.google.com/books/reader?id=F1wgqlNi8AMC&hl=&source=gbs_api",
            accessViewStatus = "SAMPLE",
            quoteSharingAllowed = false
        ),
        searchInfo = SearchInfo(
            textSnippet = "The compelling story of Charlie Gordon, willing victim of a strange experiment - a moron, a genius, a man in search of himself."
        )
    )
    private val book2 = Book(
        volumeInfo = VolumeInfo(
            imageLinks = ImageLink(
                thumbnail = "http://books.google.com/books/content?id=gK98gXR8onwC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api"
            )
        )
    )

    val books = BookData(
        kind = "books#volumes",
        totalItems = 2,
        items = listOf(book1, book2)
    )
}
