package hla.rti1516e.jlc;

import hla.rti1516e.encoding.ByteWrapper;
import hla.rti1516e.encoding.DecoderException;
import hla.rti1516e.encoding.EncoderException;

public class BasicHLAbyte extends DataElementBase implements
        hla.rti1516e.encoding.HLAbyte {

    private BasicHLAoctet value;
    
    public BasicHLAbyte() {
        value = new BasicHLAoctet();
    }
    
    public BasicHLAbyte(byte b) {
        value = new BasicHLAoctet(b);
    }

    @Override
    public int getOctetBoundary() {
        return value.getOctetBoundary();
    }

    @Override
    public void encode(ByteWrapper byteWrapper) throws EncoderException {
        value.encode(byteWrapper);
    }

    @Override
    public int getEncodedLength() {
        return value.getEncodedLength();
    }

    @Override
    public void decode(ByteWrapper byteWrapper) throws DecoderException {
        value.decode(byteWrapper);
    }

    @Override
    public void decode(byte[] bytes) throws DecoderException {
        value.decode(bytes);
    }

    @Override
    public byte getValue() {
        return value.getValue();
    }

    @Override
    public void setValue(byte value) {
        this.value.setValue(value);
    }

}