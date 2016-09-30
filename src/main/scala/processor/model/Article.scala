package processor.model

import java.time.LocalDate
import java.util.UUID

import processor.model.ArticleSource.ArticleSource

case class Article (id: UUID,
                    source: ArticleSource,
                    originalId: String,
                    createdAt: LocalDate,
                    link: List[String],
                    description: String)
