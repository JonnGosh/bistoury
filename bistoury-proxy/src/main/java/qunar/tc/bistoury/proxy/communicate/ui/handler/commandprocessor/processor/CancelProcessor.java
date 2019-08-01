package qunar.tc.bistoury.proxy.communicate.ui.handler.commandprocessor.processor;

import com.google.common.collect.ImmutableSet;
import org.springframework.stereotype.Service;
import qunar.tc.bistoury.proxy.communicate.ui.handler.commandprocessor.AbstractCommand;
import qunar.tc.bistoury.remoting.protocol.CommandCode;

import java.util.Set;

/**
 * @author leix.xie
 * @date 2019/6/13 12:01
 * @describe
 */
@Service
public class CancelProcessor extends AbstractCommand<String> {


    @Override
    public Set<Integer> getCodes() {
        return ImmutableSet.of(CommandCode.REQ_TYPE_CANCEL.getCode());
    }

    @Override
    public int getMinAgentVersion() {
        return -1;
    }

    @Override
    public boolean supportMulti() {
        return true;
    }
}