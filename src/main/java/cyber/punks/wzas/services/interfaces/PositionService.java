package cyber.punks.wzas.services.interfaces;

import cyber.punks.wzas.exceptions.AccountDoesNotExistException;
import cyber.punks.wzas.exceptions.AccountHasPositionAlready;
import cyber.punks.wzas.rest.model.location.AllPositionDto;
import cyber.punks.wzas.rest.model.location.PointDto;
import cyber.punks.wzas.rest.model.location.PositionDto;
import com.vividsolutions.jts.geom.Point;


import javax.security.auth.login.AccountException;
import java.util.List;
import java.util.Optional;

public interface PositionService {

    void addPosition(PositionDto positionDto) throws AccountHasPositionAlready;

    void setCurrentPosition(PointDto currentPosition, String login) throws AccountDoesNotExistException;

    void setDestinationPosition(PointDto destinationPosition, String login) throws AccountDoesNotExistException;

    void removeDestinationPosition(String login) throws AccountDoesNotExistException;

    void removePosition(String login) throws AccountDoesNotExistException;

    Optional<PositionDto> getPosition(String login) throws AccountDoesNotExistException;

    List<PositionDto> getAllPositions();

    AllPositionDto getPositionsAroundPoints(double x, double y);

    void addTestPosition(Point position, Point destination);

    void deleteAllTesPositions();

    boolean getWaring(String login) throws AccountException;
}
