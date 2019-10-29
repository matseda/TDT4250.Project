/**
 */
package Competition.impl;

import Competition.CompetitionPackage;
import Competition.Goal;
import Competition.Match;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Competition.impl.GoalImpl#getMinute <em>Minute</em>}</li>
 *   <li>{@link Competition.impl.GoalImpl#getExtraTime <em>Extra Time</em>}</li>
 *   <li>{@link Competition.impl.GoalImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link Competition.impl.GoalImpl#getScorer <em>Scorer</em>}</li>
 *   <li>{@link Competition.impl.GoalImpl#getAssist <em>Assist</em>}</li>
 *   <li>{@link Competition.impl.GoalImpl#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalImpl extends MinimalEObjectImpl.Container implements Goal {
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
	 * The default value of the '{@link #getExtraTime() <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTime()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraTime() <em>Extra Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraTime()
	 * @generated
	 * @ordered
	 */
	protected int extraTime = EXTRA_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected String team = TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getScorer() <em>Scorer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScorer()
	 * @generated
	 * @ordered
	 */
	protected static final String SCORER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScorer() <em>Scorer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScorer()
	 * @generated
	 * @ordered
	 */
	protected String scorer = SCORER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssist() <em>Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssist()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssist() <em>Assist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssist()
	 * @generated
	 * @ordered
	 */
	protected String assist = ASSIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__MINUTE, oldMinute, minute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtraTime() {
		return extraTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraTime(int newExtraTime) {
		int oldExtraTime = extraTime;
		extraTime = newExtraTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__EXTRA_TIME, oldExtraTime, extraTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeam(String newTeam) {
		String oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScorer() {
		return scorer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScorer(String newScorer) {
		String oldScorer = scorer;
		scorer = newScorer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__SCORER, oldScorer, scorer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssist() {
		return assist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssist(String newAssist) {
		String oldAssist = assist;
		assist = newAssist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__ASSIST, oldAssist, assist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Match getMatch() {
		if (eContainerFeatureID() != CompetitionPackage.GOAL__MATCH) return null;
		return (Match)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Match newMatch, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMatch, CompetitionPackage.GOAL__MATCH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatch(Match newMatch) {
		if (newMatch != eInternalContainer() || (eContainerFeatureID() != CompetitionPackage.GOAL__MATCH && newMatch != null)) {
			if (EcoreUtil.isAncestor(this, newMatch))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, CompetitionPackage.MATCH__GOALS, Match.class, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.GOAL__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompetitionPackage.GOAL__MATCH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMatch((Match)otherEnd, msgs);
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
			case CompetitionPackage.GOAL__MATCH:
				return basicSetMatch(null, msgs);
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
			case CompetitionPackage.GOAL__MATCH:
				return eInternalContainer().eInverseRemove(this, CompetitionPackage.MATCH__GOALS, Match.class, msgs);
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
			case CompetitionPackage.GOAL__MINUTE:
				return getMinute();
			case CompetitionPackage.GOAL__EXTRA_TIME:
				return getExtraTime();
			case CompetitionPackage.GOAL__TEAM:
				return getTeam();
			case CompetitionPackage.GOAL__SCORER:
				return getScorer();
			case CompetitionPackage.GOAL__ASSIST:
				return getAssist();
			case CompetitionPackage.GOAL__MATCH:
				return getMatch();
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
			case CompetitionPackage.GOAL__MINUTE:
				setMinute((Integer)newValue);
				return;
			case CompetitionPackage.GOAL__EXTRA_TIME:
				setExtraTime((Integer)newValue);
				return;
			case CompetitionPackage.GOAL__TEAM:
				setTeam((String)newValue);
				return;
			case CompetitionPackage.GOAL__SCORER:
				setScorer((String)newValue);
				return;
			case CompetitionPackage.GOAL__ASSIST:
				setAssist((String)newValue);
				return;
			case CompetitionPackage.GOAL__MATCH:
				setMatch((Match)newValue);
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
			case CompetitionPackage.GOAL__MINUTE:
				setMinute(MINUTE_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__EXTRA_TIME:
				setExtraTime(EXTRA_TIME_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__TEAM:
				setTeam(TEAM_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__SCORER:
				setScorer(SCORER_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__ASSIST:
				setAssist(ASSIST_EDEFAULT);
				return;
			case CompetitionPackage.GOAL__MATCH:
				setMatch((Match)null);
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
			case CompetitionPackage.GOAL__MINUTE:
				return minute != MINUTE_EDEFAULT;
			case CompetitionPackage.GOAL__EXTRA_TIME:
				return extraTime != EXTRA_TIME_EDEFAULT;
			case CompetitionPackage.GOAL__TEAM:
				return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
			case CompetitionPackage.GOAL__SCORER:
				return SCORER_EDEFAULT == null ? scorer != null : !SCORER_EDEFAULT.equals(scorer);
			case CompetitionPackage.GOAL__ASSIST:
				return ASSIST_EDEFAULT == null ? assist != null : !ASSIST_EDEFAULT.equals(assist);
			case CompetitionPackage.GOAL__MATCH:
				return getMatch() != null;
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
		result.append(" (minute: ");
		result.append(minute);
		result.append(", extraTime: ");
		result.append(extraTime);
		result.append(", team: ");
		result.append(team);
		result.append(", scorer: ");
		result.append(scorer);
		result.append(", assist: ");
		result.append(assist);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
