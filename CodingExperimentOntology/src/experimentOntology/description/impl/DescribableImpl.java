/**
 */
package experimentOntology.description.impl;

import experimentOntology.description.Abstract;
import experimentOntology.description.Authors;
import experimentOntology.description.Describable;
import experimentOntology.description.DescriptionPackage;
import experimentOntology.description.Keywords;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Describable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link experimentOntology.description.impl.DescribableImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link experimentOntology.description.impl.DescribableImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link experimentOntology.description.impl.DescribableImpl#getAuthorship <em>Authorship</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DescribableImpl extends MinimalEObjectImpl.Container implements Describable {
	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Abstract abstract_;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected Keywords keywords;

	/**
	 * The cached value of the '{@link #getAuthorship() <em>Authorship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorship()
	 * @generated
	 * @ordered
	 */
	protected Authors authorship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescribableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DescriptionPackage.Literals.DESCRIBABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abstract getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(Abstract newAbstract, NotificationChain msgs) {
		Abstract oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.DESCRIBABLE__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Abstract newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.DESCRIBABLE__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.DESCRIBABLE__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.DESCRIBABLE__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keywords getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(Keywords newKeywords, NotificationChain msgs) {
		Keywords oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.DESCRIBABLE__KEYWORDS, oldKeywords, newKeywords);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(Keywords newKeywords) {
		if (newKeywords != keywords) {
			NotificationChain msgs = null;
			if (keywords != null)
				msgs = ((InternalEObject)keywords).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.DESCRIBABLE__KEYWORDS, null, msgs);
			if (newKeywords != null)
				msgs = ((InternalEObject)newKeywords).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.DESCRIBABLE__KEYWORDS, null, msgs);
			msgs = basicSetKeywords(newKeywords, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.DESCRIBABLE__KEYWORDS, newKeywords, newKeywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authors getAuthorship() {
		return authorship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorship(Authors newAuthorship, NotificationChain msgs) {
		Authors oldAuthorship = authorship;
		authorship = newAuthorship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DescriptionPackage.DESCRIBABLE__AUTHORSHIP, oldAuthorship, newAuthorship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorship(Authors newAuthorship) {
		if (newAuthorship != authorship) {
			NotificationChain msgs = null;
			if (authorship != null)
				msgs = ((InternalEObject)authorship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.DESCRIBABLE__AUTHORSHIP, null, msgs);
			if (newAuthorship != null)
				msgs = ((InternalEObject)newAuthorship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DescriptionPackage.DESCRIBABLE__AUTHORSHIP, null, msgs);
			msgs = basicSetAuthorship(newAuthorship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DescriptionPackage.DESCRIBABLE__AUTHORSHIP, newAuthorship, newAuthorship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DescriptionPackage.DESCRIBABLE__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case DescriptionPackage.DESCRIBABLE__KEYWORDS:
				return basicSetKeywords(null, msgs);
			case DescriptionPackage.DESCRIBABLE__AUTHORSHIP:
				return basicSetAuthorship(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DescriptionPackage.DESCRIBABLE__ABSTRACT:
				return getAbstract();
			case DescriptionPackage.DESCRIBABLE__KEYWORDS:
				return getKeywords();
			case DescriptionPackage.DESCRIBABLE__AUTHORSHIP:
				return getAuthorship();
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
			case DescriptionPackage.DESCRIBABLE__ABSTRACT:
				setAbstract((Abstract)newValue);
				return;
			case DescriptionPackage.DESCRIBABLE__KEYWORDS:
				setKeywords((Keywords)newValue);
				return;
			case DescriptionPackage.DESCRIBABLE__AUTHORSHIP:
				setAuthorship((Authors)newValue);
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
			case DescriptionPackage.DESCRIBABLE__ABSTRACT:
				setAbstract((Abstract)null);
				return;
			case DescriptionPackage.DESCRIBABLE__KEYWORDS:
				setKeywords((Keywords)null);
				return;
			case DescriptionPackage.DESCRIBABLE__AUTHORSHIP:
				setAuthorship((Authors)null);
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
			case DescriptionPackage.DESCRIBABLE__ABSTRACT:
				return abstract_ != null;
			case DescriptionPackage.DESCRIBABLE__KEYWORDS:
				return keywords != null;
			case DescriptionPackage.DESCRIBABLE__AUTHORSHIP:
				return authorship != null;
		}
		return super.eIsSet(featureID);
	}

} //DescribableImpl
