/**
 */
package Competition.impl;

import Competition.Booking;
import Competition.CompetitionPackage;
import Competition.Goal;
import Competition.Match;
import Competition.MatchTeam;
import Competition.Score;
import Competition.Season;
import Competition.Status;
import Competition.Substitution;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Competition.impl.MatchImpl#getId <em>Id</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getUtcDate <em>Utc Date</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getAttendance <em>Attendance</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getVenue <em>Venue</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getHomeTeam <em>Home Team</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getAwayTeam <em>Away Team</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getScore <em>Score</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getSubstitutions <em>Substitutions</em>}</li>
 *   <li>{@link Competition.impl.MatchImpl#getSeason <em>Season</em>}</li>
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
	 * The default value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinute() <em>Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinute()
	 * @generated
	 * @ordered
	 */
	protected int minute = MINUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttendance() <em>Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendance()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTENDANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttendance() <em>Attendance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttendance()
	 * @generated
	 * @ordered
	 */
	protected int attendance = ATTENDANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVenue() <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected static final String VENUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVenue() <em>Venue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenue()
	 * @generated
	 * @ordered
	 */
	protected String venue = VENUE_EDEFAULT;

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
	 * The cached value of the '{@link #getHomeTeam() <em>Home Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeTeam()
	 * @generated
	 * @ordered
	 */
	protected MatchTeam homeTeam;

	/**
	 * The cached value of the '{@link #getAwayTeam() <em>Away Team</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwayTeam()
	 * @generated
	 * @ordered
	 */
	protected MatchTeam awayTeam;

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
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<Booking> bookings;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitutions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitutions;

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
	public int getMinute() {
		return minute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinute(int newMinute) {
		int oldMinute = minute;
		minute = newMinute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAttendance() {
		return attendance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttendance(int newAttendance) {
		int oldAttendance = attendance;
		attendance = newAttendance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__ATTENDANCE, oldAttendance, attendance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVenue() {
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVenue(String newVenue) {
		String oldVenue = venue;
		venue = newVenue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__VENUE, oldVenue, venue));
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
	public MatchTeam getHomeTeam() {
		return homeTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHomeTeam(MatchTeam newHomeTeam, NotificationChain msgs) {
		MatchTeam oldHomeTeam = homeTeam;
		homeTeam = newHomeTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__HOME_TEAM, oldHomeTeam, newHomeTeam);
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
	public void setHomeTeam(MatchTeam newHomeTeam) {
		if (newHomeTeam != homeTeam) {
			NotificationChain msgs = null;
			if (homeTeam != null)
				msgs = ((InternalEObject)homeTeam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompetitionPackage.MATCH__HOME_TEAM, null, msgs);
			if (newHomeTeam != null)
				msgs = ((InternalEObject)newHomeTeam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompetitionPackage.MATCH__HOME_TEAM, null, msgs);
			msgs = basicSetHomeTeam(newHomeTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__HOME_TEAM, newHomeTeam, newHomeTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatchTeam getAwayTeam() {
		return awayTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwayTeam(MatchTeam newAwayTeam, NotificationChain msgs) {
		MatchTeam oldAwayTeam = awayTeam;
		awayTeam = newAwayTeam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__AWAY_TEAM, oldAwayTeam, newAwayTeam);
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
	public void setAwayTeam(MatchTeam newAwayTeam) {
		if (newAwayTeam != awayTeam) {
			NotificationChain msgs = null;
			if (awayTeam != null)
				msgs = ((InternalEObject)awayTeam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompetitionPackage.MATCH__AWAY_TEAM, null, msgs);
			if (newAwayTeam != null)
				msgs = ((InternalEObject)newAwayTeam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompetitionPackage.MATCH__AWAY_TEAM, null, msgs);
			msgs = basicSetAwayTeam(newAwayTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.MATCH__AWAY_TEAM, newAwayTeam, newAwayTeam));
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
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentWithInverseEList<Goal>(Goal.class, this, CompetitionPackage.MATCH__GOALS, CompetitionPackage.GOAL__MATCH);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Booking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentWithInverseEList<Booking>(Booking.class, this, CompetitionPackage.MATCH__BOOKINGS, CompetitionPackage.BOOKING__MATCH);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Substitution> getSubstitutions() {
		if (substitutions == null) {
			substitutions = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, CompetitionPackage.MATCH__SUBSTITUTIONS, CompetitionPackage.SUBSTITUTION__MATCH);
		}
		return substitutions;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.MATCH__SCORE:
				if (score != null)
					msgs = ((InternalEObject)score).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompetitionPackage.MATCH__SCORE, null, msgs);
				return basicSetScore((Score)otherEnd, msgs);
			case CompetitionPackage.MATCH__GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGoals()).basicAdd(otherEnd, msgs);
			case CompetitionPackage.MATCH__BOOKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBookings()).basicAdd(otherEnd, msgs);
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitutions()).basicAdd(otherEnd, msgs);
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
			case CompetitionPackage.MATCH__HOME_TEAM:
				return basicSetHomeTeam(null, msgs);
			case CompetitionPackage.MATCH__AWAY_TEAM:
				return basicSetAwayTeam(null, msgs);
			case CompetitionPackage.MATCH__SCORE:
				return basicSetScore(null, msgs);
			case CompetitionPackage.MATCH__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case CompetitionPackage.MATCH__BOOKINGS:
				return ((InternalEList<?>)getBookings()).basicRemove(otherEnd, msgs);
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				return ((InternalEList<?>)getSubstitutions()).basicRemove(otherEnd, msgs);
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
			case CompetitionPackage.MATCH__MINUTE:
				return getMinute();
			case CompetitionPackage.MATCH__ATTENDANCE:
				return getAttendance();
			case CompetitionPackage.MATCH__VENUE:
				return getVenue();
			case CompetitionPackage.MATCH__LAST_UPDATED:
				return getLastUpdated();
			case CompetitionPackage.MATCH__HOME_TEAM:
				return getHomeTeam();
			case CompetitionPackage.MATCH__AWAY_TEAM:
				return getAwayTeam();
			case CompetitionPackage.MATCH__SCORE:
				return getScore();
			case CompetitionPackage.MATCH__GOALS:
				return getGoals();
			case CompetitionPackage.MATCH__BOOKINGS:
				return getBookings();
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				return getSubstitutions();
			case CompetitionPackage.MATCH__SEASON:
				return getSeason();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
			case CompetitionPackage.MATCH__MINUTE:
				setMinute((Integer)newValue);
				return;
			case CompetitionPackage.MATCH__ATTENDANCE:
				setAttendance((Integer)newValue);
				return;
			case CompetitionPackage.MATCH__VENUE:
				setVenue((String)newValue);
				return;
			case CompetitionPackage.MATCH__LAST_UPDATED:
				setLastUpdated((Date)newValue);
				return;
			case CompetitionPackage.MATCH__HOME_TEAM:
				setHomeTeam((MatchTeam)newValue);
				return;
			case CompetitionPackage.MATCH__AWAY_TEAM:
				setAwayTeam((MatchTeam)newValue);
				return;
			case CompetitionPackage.MATCH__SCORE:
				setScore((Score)newValue);
				return;
			case CompetitionPackage.MATCH__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case CompetitionPackage.MATCH__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends Booking>)newValue);
				return;
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection<? extends Substitution>)newValue);
				return;
			case CompetitionPackage.MATCH__SEASON:
				setSeason((Season)newValue);
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
			case CompetitionPackage.MATCH__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__ATTENDANCE:
				setAttendance(ATTENDANCE_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__VENUE:
				setVenue(VENUE_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__LAST_UPDATED:
				setLastUpdated(LAST_UPDATED_EDEFAULT);
				return;
			case CompetitionPackage.MATCH__HOME_TEAM:
				setHomeTeam((MatchTeam)null);
				return;
			case CompetitionPackage.MATCH__AWAY_TEAM:
				setAwayTeam((MatchTeam)null);
				return;
			case CompetitionPackage.MATCH__SCORE:
				setScore((Score)null);
				return;
			case CompetitionPackage.MATCH__GOALS:
				getGoals().clear();
				return;
			case CompetitionPackage.MATCH__BOOKINGS:
				getBookings().clear();
				return;
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				getSubstitutions().clear();
				return;
			case CompetitionPackage.MATCH__SEASON:
				setSeason((Season)null);
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
			case CompetitionPackage.MATCH__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case CompetitionPackage.MATCH__ATTENDANCE:
				return attendance != ATTENDANCE_EDEFAULT;
			case CompetitionPackage.MATCH__VENUE:
				return VENUE_EDEFAULT == null ? venue != null : !VENUE_EDEFAULT.equals(venue);
			case CompetitionPackage.MATCH__LAST_UPDATED:
				return LAST_UPDATED_EDEFAULT == null ? lastUpdated != null : !LAST_UPDATED_EDEFAULT.equals(lastUpdated);
			case CompetitionPackage.MATCH__HOME_TEAM:
				return homeTeam != null;
			case CompetitionPackage.MATCH__AWAY_TEAM:
				return awayTeam != null;
			case CompetitionPackage.MATCH__SCORE:
				return score != null;
			case CompetitionPackage.MATCH__GOALS:
				return goals != null && !goals.isEmpty();
			case CompetitionPackage.MATCH__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case CompetitionPackage.MATCH__SUBSTITUTIONS:
				return substitutions != null && !substitutions.isEmpty();
			case CompetitionPackage.MATCH__SEASON:
				return getSeason() != null;
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
		result.append(", minute: ");
		result.append(minute);
		result.append(", attendance: ");
		result.append(attendance);
		result.append(", venue: ");
		result.append(venue);
		result.append(", lastUpdated: ");
		result.append(lastUpdated);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
