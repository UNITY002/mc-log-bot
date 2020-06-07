package com.github.ubunfu.mclogbot.parser;

import com.github.ubunfu.mclogbot.client.discord.request.Field;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
@ConditionalOnProperty(name = "bot.player-joined.enabled", havingValue = "true")
public class PlayerJoinedLogParser extends AbstractLogParser {

    @Override
    public ParserResponse parse(String logMessage) {
        fields.clear();
        fields.add(new Field("Player", getPlayerName(logMessage)));
        return new ParserResponse(fields);
    }

    private String getPlayerName(String logMessage) {
        return logMessage.split(" ")[3];
    }
}
