/**
 */
package competition.impl;

import competition.Competition;
import competition.CompetitionPackage;
import competition.Match;
import competition.Season;

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
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link competition.impl.SeasonImpl#getId <em>Id</em>}</li>
 *   <li>{@link competition.impl.SeasonImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link competition.impl.SeasonImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link competition.impl.SeasonImpl#getCurrentMatchday <em>Current Matchday</em>}</li>
 *   <li>{@link competition.impl.SeasonImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link competition.impl.SeasonImpl#getCompetition <em>Competition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends MinimalEObjectImpl.Container implements Season {
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
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentMatchday() <em>Current Matchday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMatchday()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_MATCHDAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentMatchday() <em>Current Matchday</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMatchday()
	 * @generated
	 * @ordered
	 */
	protected int currentMatchday = CURRENT_MATCHDAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompetitionPackage.Literals.SEASON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SEASON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SEASON__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SEASON__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentMatchday() {
		return currentMatchday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentMatchday(int newCurrentMatchday) {
		int oldCurrentMatchday = currentMatchday;
		currentMatchday = newCurrentMatchday;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SEASON__CURRENT_MATCHDAY, oldCurrentMatchday, currentMatchday));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentWithInverseEList<Match>(Match.class, this, CompetitionPackage.SEASON__MATCHES, CompetitionPackage.MATCH__SEASON);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Competition getCompetition() {
		if (eContainerFeatureID() != CompetitionPackage.SEASON__COMPETITION) return null;
		return (Competition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompetition(Competition newCompetition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompetition, CompetitionPackage.SEASON__COMPETITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompetition(Competition newCompetition) {
		if (newCompetition != eInternalContainer() || (eContainerFeatureID() != CompetitionPackage.SEASON__COMPETITION && newCompetition != null)) {
			if (EcoreUtil.isAncestor(this, newCompetition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompetition != null)
				msgs = ((InternalEObject)newCompetition).eInverseAdd(this, CompetitionPackage.COMPETITION__CURRENT_SEASON, Competition.class, msgs);
			msgs = basicSetCompetition(newCompetition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompetitionPackage.SEASON__COMPETITION, newCompetition, newCompetition));
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
			case CompetitionPackage.SEASON__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case CompetitionPackage.SEASON__COMPETITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompetition((Competition)otherEnd, msgs);
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
			case CompetitionPackage.SEASON__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case CompetitionPackage.SEASON__COMPETITION:
				return basicSetCompetition(null, msgs);
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
			case CompetitionPackage.SEASON__COMPETITION:
				return eInternalContainer().eInverseRemove(this, CompetitionPackage.COMPETITION__CURRENT_SEASON, Competition.class, msgs);
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
			case CompetitionPackage.SEASON__ID:
				return getId();
			case CompetitionPackage.SEASON__START_DATE:
				return getStartDate();
			case CompetitionPackage.SEASON__END_DATE:
				return getEndDate();
			case CompetitionPackage.SEASON__CURRENT_MATCHDAY:
				return getCurrentMatchday();
			case CompetitionPackage.SEASON__MATCHES:
				return getMatches();
			case CompetitionPackage.SEASON__COMPETITION:
				return getCompetition();
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
			case CompetitionPackage.SEASON__ID:
				setId((Integer)newValue);
				return;
			case CompetitionPackage.SEASON__START_DATE:
				setStartDate((Date)newValue);
				return;
			case CompetitionPackage.SEASON__END_DATE:
				setEndDate((Date)newValue);
				return;
			case CompetitionPackage.SEASON__CURRENT_MATCHDAY:
				setCurrentMatchday((Integer)newValue);
				return;
			case CompetitionPackage.SEASON__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case CompetitionPackage.SEASON__COMPETITION:
				setCompetition((Competition)newValue);
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
			case CompetitionPackage.SEASON__ID:
				setId(ID_EDEFAULT);
				return;
			case CompetitionPackage.SEASON__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case CompetitionPackage.SEASON__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case CompetitionPackage.SEASON__CURRENT_MATCHDAY:
				setCurrentMatchday(CURRENT_MATCHDAY_EDEFAULT);
				return;
			case CompetitionPackage.SEASON__MATCHES:
				getMatches().clear();
				return;
			case CompetitionPackage.SEASON__COMPETITION:
				setCompetition((Competition)null);
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
			case CompetitionPackage.SEASON__ID:
				return id != ID_EDEFAULT;
			case CompetitionPackage.SEASON__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case CompetitionPackage.SEASON__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case CompetitionPackage.SEASON__CURRENT_MATCHDAY:
				return currentMatchday != CURRENT_MATCHDAY_EDEFAULT;
			case CompetitionPackage.SEASON__MATCHES:
				return matches != null && !matches.isEmpty();
			case CompetitionPackage.SEASON__COMPETITION:
				return getCompetition() != null;
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
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", currentMatchday: ");
		result.append(currentMatchday);
		result.append(')');
		return result.toString();
	}

} //SeasonImpl
