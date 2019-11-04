/**
 */
package competition.impl;

import competition.CompetitionPackage;
import competition.Match;
import competition.Score;
import competition.Season;
import competition.Status;
import competition.Team;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link competition.impl.MatchImpl#getId <em>Id</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getUtcDate <em>Utc Date</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getMatchDay <em>Match Day</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getScore <em>Score</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link competition.impl.MatchImpl#getAwayTeam <em>Away Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtcDate() <em>Utc Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date UTC_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUtcDate() <em>Utc Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtcDate()
	 * @generated
	 * @ordered
	 */
	protected Date utcDate = UTC_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.FINISHED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchDay() <em>Match Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchDay()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCH_DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatchDay() <em>Match Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchDay()
	 * @generated
	 * @ordered
	 */
	protected int matchDay = MATCH_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdated() <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdated = LAST_UPDATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Score score;

	/**
	 * The cached value of the '{@link #getHomeTeam() <em>Home Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeam()
	 * @generated
	 * @ordered
	 */
	protected Team homeTeam;

	/**
	 * The cached value of the '{@link #getAwayTeam() <em>Away Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeam()
	 * @generated
	 * @ordered
	 */
	protected Team awayTeam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUtcDate() {
		return utcDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtcDate(Date newUtcDate) {
		Date oldUtcDate = utcDate;
		utcDate = newUtcDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__UTC_DATE, oldUtcDate, utcDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMatchDay() {
		return matchDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchDay(int newMatchDay) {
		int oldMatchDay = matchDay;
		matchDay = newMatchDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__MATCH_DAY, oldMatchDay, matchDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdated(Date newLastUpdated) {
		Date oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__LAST_UPDATED, oldLastUpdated, lastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Score getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScore(Score newScore, NotificationChain msgs) {
		Score oldScore = score;
		score = newScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__SCORE, oldScore, newScore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(Score newScore) {
		if (newScore != score) {
			NotificationChain msgs = null;
			if (score != null)
				msgs = ((InternalEObject)score).eInverseRemove(this, CompetitionPackage.SCORE__MATCH, Score.class, msgs);
			if (newScore != null)
				msgs = ((InternalEObject)newScore).eInverseAdd(this, CompetitionPackage.SCORE__MATCH, Score.class, msgs);
			msgs = basicSetScore(newScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__SCORE, newScore, newScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Season getSeason() {
		if (eContainerFeatureID() != CompetitionPackage.MATCH__SEASON) return null;
		return (Season)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSeason, CompetitionPackage.MATCH__SEASON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(Season newSeason) {
		if (newSeason != eInternalContainer() || (eContainerFeatureID() != CompetitionPackage.MATCH__SEASON && newSeason != null)) {
			if (EcoreUtil.isAncestor(this, newSeason))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, CompetitionPackage.SEASON__MATCHES, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getHomeTeam() {
		if (homeTeam != null && homeTeam.eIsProxy()) {
			InternalEObject oldHomeTeam = (InternalEObject)homeTeam;
			homeTeam = (Team)eResolveProxy(oldHomeTeam);
			if (homeTeam != oldHomeTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.MATCH__HOME_TEAM, oldHomeTeam, homeTeam));
			}
		}
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetHomeTeam() {
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomeTeam(Team newHomeTeam) {
		Team oldHomeTeam = homeTeam;
		homeTeam = newHomeTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__HOME_TEAM, oldHomeTeam, homeTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getAwayTeam() {
		if (awayTeam != null && awayTeam.eIsProxy()) {
			InternalEObject oldAwayTeam = (InternalEObject)awayTeam;
			awayTeam = (Team)eResolveProxy(oldAwayTeam);
			if (awayTeam != oldAwayTeam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompetitionPackage.MATCH__AWAY_TEAM, oldAwayTeam, awayTeam));
			}
		}
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetAwayTeam() {
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwayTeam(Team newAwayTeam) {
		Team oldAwayTeam = awayTeam;
		awayTeam = newAwayTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__AWAY_TEAM, oldAwayTeam, awayTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.MATCH__SCORE:
				if (score != null)
					msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompetitionPackage.MATCH__SCORE, null, msgs);
				return basicSetScore((Score)otherEnd, msgs);
			case CompetitionPackage.MATCH__SEASON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSeason((Season)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.MATCH__SCORE:
				return basicSetScore(null, msgs);
			case CompetitionPackage.MATCH__SEASON:
				return basicSetSeason(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CompetitionPackage.MATCH__SEASON:
				return eInternalContainer().eInverseRemove(this, CompetitionPackage.SEASON__MATCHES, Season.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CompetitionPackage.MATCH__ID:
				return getId();
			case CompetitionPackage.MATCH__UTC_DATE:
				return getUtcDate();
			case CompetitionPackage.MATCH__STATUS:
				return getStatus();
			case CompetitionPackage.MATCH__MATCH_DAY:
				return getMatchDay();
			case CompetitionPackage.MATCH__LAST_UPDATED:
				return getLastUpdated();
			case CompetitionPackage.MATCH__SCORE:
				return getScore();
			case CompetitionPackage.MATCH__SEASON:
				return getSeason();
			case CompetitionPackage.MATCH__HOME_TEAM:
				if (resolve) return getHomeTeam();
				return basicGetHomeTeam();
			case CompetitionPackage.MATCH__AWAY_TEAM:
				if (resolve) return getAwayTeam();
				return basicGetAwayTeam();
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
			case CompetitionPackage.MATCH__ID:
				setId((Integer)newValue);
				return;
			case CompetitionPackage.MATCH__UTC_DATE:
				setUtcDate((Date)newValue);
				return;
			case CompetitionPackage.MATCH__STATUS:
				setStatus((Status)newValue);
				return;
			case CompetitionPackage.MATCH__MATCH_DAY:
				setMatchDay((Integer)newValue);
				return;
			case CompetitionPackage.MATCH__LAST_UPDATED:
				setLastUpdated((Date)newValue);
				return;
			case CompetitionPackage.MATCH__SCORE:
				setScore((Score)newValue);
				return;
			case CompetitionPackage.MATCH__SEASON:
				setSeason((Season)newValue);
				return;
			case CompetitionPackage.MATCH__HOME_TEAM:
				setHomeTeam((Team)newValue);
				return;
			case CompetitionPackage.MATCH__AWAY_TEAM:
				setAwayTeam((Team)newValue);
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
			case CompetitionPackage.MATCH__ID:
				setId(ID_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__UTC_DATE:
				setUtcDate(UTC_DATE_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__MATCH_DAY:
				setMatchDay(MATCH_DAY_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__LAST_UPDATED:
				setLastUpdated(LAST_UPDATED_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__SCORE:
				setScore((Score)null);
				return;
			case CompetitionPackage.MATCH__SEASON:
				setSeason((Season)null);
				return;
			case CompetitionPackage.MATCH__HOME_TEAM:
				setHomeTeam((Team)null);
				return;
			case CompetitionPackage.MATCH__AWAY_TEAM:
				setAwayTeam((Team)null);
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
			case CompetitionPackage.MATCH__ID:
				return id != ID_EDEFAULT;
			case CompetitionPackage.MATCH__UTC_DATE:
				return UTC_DATE_EDEFAULT == null ? utcDate != null : !UTC_DATE_EDEFAULT.equals(utcDate);
			case CompetitionPackage.MATCH__STATUS:
				return status != STATUS_EDEFAULT;
			case CompetitionPackage.MATCH__MATCH_DAY:
				return matchDay != MATCH_DAY_EDEFAULT;
			case CompetitionPackage.MATCH__LAST_UPDATED:
				return LAST_UPDATED_EDEFAULT == null ? lastUpdated != null : !LAST_UPDATED_EDEFAULT.equals(lastUpdated);
			case CompetitionPackage.MATCH__SCORE:
				return score != null;
			case CompetitionPackage.MATCH__SEASON:
				return getSeason() != null;
			case CompetitionPackage.MATCH__HOME_TEAM:
				return homeTeam != null;
			case CompetitionPackage.MATCH__AWAY_TEAM:
				return awayTeam != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", utcDate: ");
		result.append(utcDate);
		result.append(", status: ");
		result.append(status);
		result.append(", matchDay: ");
		result.append(matchDay);
		result.append(", lastUpdated: ");
		result.append(lastUpdated);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
