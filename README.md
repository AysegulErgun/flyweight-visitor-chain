Orman Yönetim Sistemi Senaryo: Ormanda Ağaç İşleme Uygulaması Bu proje, Flyweight, Visitor ve Chain of Responsibility tasarım desenlerini bir araya getirerek optimize bir orman yönetim sistemi sunar. Projenin ana amacı, bir ormandaki ağaçların türlerini ve pozisyonlarını yönetmek, her ağaca farklı işlemler uygulamak ve bu işlemleri zincirleme şekilde gerçekleştirmektir.

Projenin Yapısı: Flyweight Deseni:

Paylaşılan durum (Intrinsic State): Ağaç türü (TreeType). Paylaşılamayan durum (Extrinsic State): Her ağacın konumu (Tree). TreeFactory: Ağaç türlerini hafızada tutarak performansı optimize eder. Visitor Deseni:

Ziyaretçi nesnesi (TreeVisitor) ile her ağaca özel işlemler yapılır. Örneğin, bir ağaç türü ziyaret edilerek türüne özgü bilgi veya işlem gerçekleştirilir. Chain of Responsibility Deseni:

Sorumluluk zinciri ile ağaçlara zincirleme işlemler uygulanır. Örneğin, bir ağaç önce kesilir (TreeCutterHandler), ardından izlenir (TreeWatcherHandler).
