/**
 */
package competition.impl;

import competition.CompetitionPackage;
import competition.Positon;
import competition.Team;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Positon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link competition.impl.PositonImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getPlayedGames <em>Played Games</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getWon <em>Won</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getDraw <em>Draw</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getLost <em>Lost</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getGoalsAgaints <em>Goals Againts</em>}</li>
 *   <li>{@link competition.impl.PositonImpl#getGoalDifference <em>Goal Difference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositonImpl extends MinimalEObjectImpl.Container implements Positon {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected Team team;

	/**
	 * The default value of the '{@link #getPlayedGames() <em>Played Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayedGames()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYED_GAMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlayedGames() <em>Played Games</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayedGames()
	 * @generated
	 * @ordered
	 */
	protected int playedGames = PLAYED_GAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWon() <em>Won</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWon()
	 * @generated
	 * @ordered
	 */
	protected static final int WON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWon() <em>Won</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWon()
	 * @generated
	 * @ordered
	 */
	protected int won = WON_EDEFAULT;

	/**
	 * The default value of the '{@link #getDraw() <em>Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraw()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDraw() <em>Draw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraw()
	 * @generated
	 * @ordered
	 */
	protected int draw = DRAW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLost() <em>Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLost()
	 * @generated
	 * @ordered
	 */
	protected static final int LOST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLost() <em>Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLost()
	 * @generated
	 * @ordered
	 */
	protected int lost = LOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_FOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected int goalsFor = GOALS_FOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalsAgaints() <em>Goals Againts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsAgaints()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_AGAINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalsAgaints() <em>Goals Againts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalsAgaints()
	 * @generated
	 * @ordered
	 */
	protected int goalsAgaints = GOALS_AGAINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected static final int GOAL_DIFFERENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected int goalDifference = GOAL_DIFFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.POSITON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		if (team != null && team.eIsProxy()) {
			InternalEObject oldTeam = (InternalEObject)team;
			team = (Team)eResolveProxy(oldTeam);
			if (team != oldTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.POSITON__TEAM, oldTeam, team));
			}
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(Team newTeam) {
		Team oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlayedGames() {
		return playedGames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayedGames(int newPlayedGames) {
		int oldPlayedGames = playedGames;
		playedGames = newPlayedGames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__PLAYED_GAMES, oldPlayedGames, playedGames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWon() {
		return won;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWon(int newWon) {
		int oldWon = won;
		won = newWon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__WON, oldWon, won));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDraw() {
		return draw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDraw(int newDraw) {
		int oldDraw = draw;
		draw = newDraw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__DRAW, oldDraw, draw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLost() {
		return lost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLost(int newLost) {
		int oldLost = lost;
		lost = newLost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__LOST, oldLost, lost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalsFor(int newGoalsFor) {
		int oldGoalsFor = goalsFor;
		goalsFor = newGoalsFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__GOALS_FOR, oldGoalsFor, goalsFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoalsAgaints() {
		return goalsAgaints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalsAgaints(int newGoalsAgaints) {
		int oldGoalsAgaints = goalsAgaints;
		goalsAgaints = newGoalsAgaints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__GOALS_AGAINTS, oldGoalsAgaints, goalsAgaints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGoalDifference() {
		return goalDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalDifference(int newGoalDifference) {
		int oldGoalDifference = goalDifference;
		goalDifference = newGoalDifference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.POSITON__GOAL_DIFFERENCE, oldGoalDifference, goalDifference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.POSITON__POSITION:
				return getPosition();
			case CompetitionPackage.POSITON__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case CompetitionPackage.POSITON__PLAYED_GAMES:
				return getPlayedGames();
			case CompetitionPackage.POSITON__WON:
				return getWon();
			case CompetitionPackage.POSITON__DRAW:
				return getDraw();
			case CompetitionPackage.POSITON__LOST:
				return getLost();
			case CompetitionPackage.POSITON__POINTS:
				return getPoints();
			case CompetitionPackage.POSITON__GOALS_FOR:
				return getGoalsFor();
			case CompetitionPackage.POSITON__GOALS_AGAINTS:
				return getGoalsAgaints();
			case CompetitionPackage.POSITON__GOAL_DIFFERENCE:
				return getGoalDifference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CompetitionPackage.POSITON__POSITION:
				setPosition((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__TEAM:
				setTeam((Team)newValue);
				return;
			case CompetitionPackage.POSITON__PLAYED_GAMES:
				setPlayedGames((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__WON:
				setWon((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__DRAW:
				setDraw((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__LOST:
				setLost((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__POINTS:
				setPoints((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__GOALS_FOR:
				setGoalsFor((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__GOALS_AGAINTS:
				setGoalsAgaints((Integer)newValue);
				return;
			case CompetitionPackage.POSITON__GOAL_DIFFERENCE:
				setGoalDifference((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CompetitionPackage.POSITON__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__TEAM:
				setTeam((Team)null);
				return;
			case CompetitionPackage.POSITON__PLAYED_GAMES:
				setPlayedGames(PLAYED_GAMES_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__WON:
				setWon(WON_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__DRAW:
				setDraw(DRAW_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__LOST:
				setLost(LOST_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__GOALS_FOR:
				setGoalsFor(GOALS_FOR_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__GOALS_AGAINTS:
				setGoalsAgaints(GOALS_AGAINTS_EDEFAULT);
				return;
			case CompetitionPackage.POSITON__GOAL_DIFFERENCE:
				setGoalDifference(GOAL_DIFFERENCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CompetitionPackage.POSITON__POSITION:
				return position != POSITION_EDEFAULT;
			case CompetitionPackage.POSITON__TEAM:
				return team != null;
			case CompetitionPackage.POSITON__PLAYED_GAMES:
				return playedGames != PLAYED_GAMES_EDEFAULT;
			case CompetitionPackage.POSITON__WON:
				return won != WON_EDEFAULT;
			case CompetitionPackage.POSITON__DRAW:
				return draw != DRAW_EDEFAULT;
			case CompetitionPackage.POSITON__LOST:
				return lost != LOST_EDEFAULT;
			case CompetitionPackage.POSITON__POINTS:
				return points != POINTS_EDEFAULT;
			case CompetitionPackage.POSITON__GOALS_FOR:
				return goalsFor != GOALS_FOR_EDEFAULT;
			case CompetitionPackage.POSITON__GOALS_AGAINTS:
				return goalsAgaints != GOALS_AGAINTS_EDEFAULT;
			case CompetitionPackage.POSITON__GOAL_DIFFERENCE:
				return goalDifference != GOAL_DIFFERENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (position: ");
		result.append(position);
		result.append(", playedGames: ");
		result.append(playedGames);
		result.append(", won: ");
		result.append(won);
		result.append(", draw: ");
		result.append(draw);
		result.append(", lost: ");
		result.append(lost);
		result.append(", points: ");
		result.append(points);
		result.append(", goalsFor: ");
		result.append(goalsFor);
		result.append(", goalsAgaints: ");
		result.append(goalsAgaints);
		result.append(", goalDifference: ");
		result.append(goalDifference);
		result.append(')');
		return result.toString();
	}

} //PositonImpl
