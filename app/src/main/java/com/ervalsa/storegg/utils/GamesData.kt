package com.ervalsa.storegg.utils

import com.ervalsa.storegg.model.Game

object GamesData {

    private val gameNames = arrayOf(
        "The Last of Us",
        "Horizon Zero Dawn",
        "The Last of Us Part II",
        "Horizon Forbidden West",
        "Naruto Shippuden: Ultimate Ninja Storm 4",
        "God of War",
        "Minecraft",
        "God of War Ragnarok",
        "Genshin Impact",
        "Stardew Valley",
        "Dota 2",
        "Control",
        "Call of Duty: Ghosts"
    )

    private val gameDescription = arrayOf(
        "A third person shooter/stealth/survival hybrid, in which twenty years after the outbreak of a parasitic fungus which takes over the neural functions of humans, Joel, a Texan with a tragic familial past, finds himself responsible with smuggling a fourteen year old girl named Ellie to a militia group called the Fireflies, while avoiding strict and deadly authorities, infected fungal hosts and other violent survivors.",
        "Welcome to a vibrant world rich with the beauty of nature – but inhabited by awe-inspiring, highly advanced machines. As a young machine hunter named Aloy, you must unravel the mysteries of this world and find your own destiny.",
        "Set 5 years after the events of The Last of Us, we see the return of Joel and Ellie. Driven by hatred, Ellie sets out for Seattle to serve justice. However, she begins to wonder what justice really means.",
        "Horizon Forbidden West continues Aloy’s story as she moves west to a far-future America to brave a majestic, but dangerous frontier where she’ll face awe-inspiring machines and mysterious new threats.",
        "Experience the exhilarating full-adventure Naruto Shippuden and follow Naruto Uzumaki on all his fights.\n" + "With more than 12 million Naruto Shippuden Ultimate Ninja STORM games sold worldwide, this series established itself among the pinnacle of Anime & Manga adaptations on videogames! As every good story comes to an end Naruto Shippuden: Ultimate Ninja Storm 4 is going to be the ultimate STORM game! For the first time ever, a Naruto/Naruto Shippuden game will take advantage of the graphics power of the new generation of consoles.",
        "God of War is the sequel to God of War III as well as a continuation of the canon God of War chronology. Unlike previous installments, this game focuses on Norse mythology and follows an older and more seasoned Kratos and his son Atreus in the years since the third game. It is in this harsh, unforgiving world that he must fight to survive… and teach his son to do the same.",
        "Minecraft focuses on allowing the player to explore, interact with, and modify a dynamically-generated map made of one-cubic-meter-sized blocks. In addition to blocks, the environment features plants, mobs, and items. Some activities in the game include mining for ore, fighting hostile mobs, and crafting new blocks and tools by gathering various resources found in the game. The game's open-ended model allows players to create structures, creations, and artwork on various multiplayer servers or their single-player maps. Other features include redstone circuits for logic computations and remote actions, minecarts and tracks, and a mysterious underworld called the Nether. A designated but completely optional goal of the game is to travel to a dimension called the End, and defeat the ender dragon.",
        "God of War: Ragnarök is the tentative title for the upcoming action-adventure game in development by Santa Monica Studio and to be published by Sony Interactive Entertainment (SIE). It is scheduled to be released in 2021 for the PlayStation 5 (PS5). It will be the ninth installment in the God of War series, the ninth chronologically, and the sequel to 2018's God of War. Loosely based on Norse mythology, the game will be set in ancient Norway and feature series protagonists Kratos, the former Greek God of War who remains the only playable character, and his young son Atreus. The game is expected to kick off the events of Ragnarök, a series of events that bring about the end of days and depict the deaths of the Norse gods in Norse mythology.",
        "Genshin Impact is an open-world action RPG, where you embark on a journey across Teyvat to find your lost sibling and seek answers from The Seven, the gods of each element. Explore this wondrous world, join forces with a diverse range of characters, and unravel the countless mysteries that Teyvat holds...",
        "Stardew Valley is an open-ended country-life RPG! You’ve inherited your grandfather’s old farm plot in Stardew Valley. Armed with hand-me-down tools and a few coins, you set out to begin your new life. Can you learn to live off the land and turn these overgrown fields into a thriving home? It won’t be easy. Ever since Joja Corporation came to town, the old ways of life have all but disappeared. The community center, once the town’s most vibrant hub of activity, now lies in shambles. But the valley seems full of opportunity. With a little dedication, you might just be the one to restore Stardew Valley to greatness!",
        "Dota 2 is a multiplayer online battle arena video game and the stand-alone sequel to the Defense of the Ancients (DotA) mod. With regular updates that ensure a constant evolution of gameplay, features, and heroes, Dota 2 has taken on a life of its own.",
        "Control is a supernatural 3rd person action-adventure will challenge you to master the combination of supernatural abilities, modifiable loadouts and reactive environments while fighting through a deep and unpredictable world.",
        "Call of Duty: Ghosts takes place following a catastrophic event that changed the global balance of powers in the world. As a result, the United States is no longer recognized as a superpower. Ten years after the event, an unseen enemy emerges as a threat, but the remnants of US special forces from every branch came together to create an elite group of soldiers known as the \"Ghosts\", who are determined to eradicate all threats to protect the weak and the remains of America."
    )

    private val gameReleaseDate = arrayOf(
        "Jun 14, 2013",
        "Feb 28, 2017",
        "Jun 19, 2020",
        "Feb 18, 2022",
        "Feb 04, 2016",
        "Apr 20, 2018",
        "Aug 15, 2011",
        "Nov 09, 2022",
        "Sep 28, 2020",
        "Feb 26, 2016",
        "Jul 09, 2013",
        "Aug 27, 2019",
        "Nov 05, 2013"
    )

    private val gameCompany = arrayOf(
        "Naughty Dog",
        "Guerrilla Games",
        "Naughty Dog",
        "Guerrilla Games",
        "CyberConnect2",
        "SIE Santa Monica Studio",
        "Mojang Studios",
        "SIE Santa Monica Studio",
        "HoYoverse",
        "ConcernenApe",
        "Valve Corporation",
        "Remedy Entertainment",
        "Neversoft Entertainment"
    )

    private val gameImageUrl = arrayOf(
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co1r7f.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co2una.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co1r0o.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co2gvu.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co3whm.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co1tmu.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co49x5.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co3swk.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co480t.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/xrpmydnu9rpxvxfjkiu7.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co4bko.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co2evj.png",
        "https://images.igdb.com/igdb/image/upload/t_cover_big/co3b15.png"
    )

    private val gameGenre = arrayOf(
        "Adventure, Shooter",
        "Adventure, Role-playing (RPG), Shooter",
        "Adventure, Shooter",
        "Adventure, Role-playing (RPG)",
        "Adventure, Fighting",
        "Adventure, Hack and slash/Beat 'em up",
        "Adventure, Arcade",
        "Adventure, Arcade",
        "Adventure",
        "Indie, Role-playing (RPG), Simulator",
        "MOBA, Strategy",
        "Adventure, Shooter",
        "Shooter"
    )

    private val gameRating = intArrayOf(
        9,
        9,
        9,
        8,
        7,
        9,
        8,
        0,
        8,
        8,
        8,
        8,
        6
    )

    private val gamePlatform = arrayOf(
        "Playstation 3",
        "PlayStation 4, PC (Microsoft Windows)",
        "PlayStation 4",
        "PlayStation 4, PlayStation 5",
        "Xbox One, PlayStation 4, PC (Microsoft Windows)",
        "PlayStation 4, PC (Microsoft Windows)",
        "Android, Linux, Mac, PC (Microsoft Windows)",
        "PlayStation 4, PlayStation 5",
        "Android, PlayStation 4, iOS, PlayStation 5, PC (Microsoft Windows)",
        "Android, Xbox One, PlayStation 4, Linux, Mac, iOS, PlayStation Vita, PC (Microsoft Windows), Nintendo Switch",
        "Linux, Mac, PC (Microsoft Windows)",
        "Xbox One, PlayStation 4, PlayStation 5, PC (Microsoft Windows), Nintendo Switch, Google Stadia",
        "Xbox One, Wii U, PlayStation 4, Xbox 360, PC (Microsoft Windows), PlayStation 3"
    )

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameNames.indices) {
                val game = Game()
                game.name = gameNames[position]
                game.description = gameDescription[position]
                game.releaseDate = gameReleaseDate[position]
                game.company = gameCompany[position]
                game.imageUrl = gameImageUrl[position]
                game.genre = gameGenre[position]
                game.rating = gameRating[position]
                game.platform = gamePlatform[position]
                list.add(game)
            }
            return list
        }
}